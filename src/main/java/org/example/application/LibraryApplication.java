package org.example.application;

import org.example.dao.LibraryDAO;
import org.example.entity.*;

public class LibraryApplication {
    public static void main(String[] args) {
        LibraryDAO dao = new LibraryDAO();

        EBook ebook = new EBook("aasin kirja", "123", "https://download.com/aasi");
        PrintedBook printedBook = new PrintedBook("printattu aasin opas", "321", 10);
        dao.insertBook(ebook);
        dao.insertBook(printedBook);

        Biography bio = new Biography("yoyo");
        Author author = new Author("Iso mies", bio);
        dao.insertAuthor(author);

        Student student = new Student("Jaakko");
        dao.insertStudent(student);

        dao.borrowBook(student, printedBook);

        System.out.println("Data inserted successfully!");
        dao.close();
    }
}
