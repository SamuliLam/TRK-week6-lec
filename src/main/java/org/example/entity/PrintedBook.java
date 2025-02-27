package org.example.entity;

import jakarta.persistence.Entity;

@Entity
public class PrintedBook extends Book {
    private int numberOfPages;

    public PrintedBook() {}

    public PrintedBook(String title, String isbn, int numberOfPages) {
        super(title, isbn);
        this.numberOfPages = numberOfPages;
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
