package org.example.entity;

import jakarta.persistence.Entity;

@Entity
public class EBook extends Book {
    private String downloadUrl;

    public EBook() {}

    public EBook(String title, String isbn, String downloadUrl) {
        super(title, isbn);
        this.downloadUrl = downloadUrl;
    }

    // Getters and Setters
}
