package org.example.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_id;

    private String name;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<BorrowedBook> borrowedBooks = new HashSet<>();

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Set<BorrowedBook> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
