package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entity.*;

import java.util.Date;

public class LibraryDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");

    public void insertStudent(Student student) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    public void insertBook(Book book) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
        em.close();
    }

    public void borrowBook(Student student, Book book) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        BorrowedBook borrowedBook = new BorrowedBook(student, book, new Date());
        student.getBorrowedBooks().add(borrowedBook);
        em.persist(borrowedBook);

        em.getTransaction().commit();
        em.close();
    }

    public void close() {
        emf.close();
    }

    public void insertAuthor(Author author) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(author);
        em.getTransaction().commit();
        em.close();
    }

}