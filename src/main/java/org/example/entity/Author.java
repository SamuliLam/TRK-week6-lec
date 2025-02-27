package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long author_id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "biography_id")
    private Biography biography;

    public Author(String name, Biography bio) {
        this.name = name;
        this.biography = bio;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Biography getBiography() {
        return biography;
    }

    public void setBiography(Biography biography) {
        this.biography = biography;
    }
}
