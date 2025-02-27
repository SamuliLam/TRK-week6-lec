package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Biography")
public class Biography {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long biography_id;
    private String content;

    @OneToOne(mappedBy = "biography")
    private Author author;

    public Biography(String s) {
    }

    public Biography() {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
