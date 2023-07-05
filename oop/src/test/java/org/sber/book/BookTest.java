package org.sber.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private static final Book book = new Book(
            "IT",
            new Author("Stephen King", "Male", "Stephen@king.com"),
            1986
    );

    @Test
    void getTitle() {
        System.out.println(book.getTitle());
    }

    @Test
    void getAuthor() {
        System.out.println(book.getAuthor().toString());
    }

    @Test
    void setYear() {
        book.setYear(2017);
        System.out.println(book.getYear());
    }

    @Test
    void getYear() {
        System.out.println(book.getYear());
    }

    @Test
    void testToString() {
        System.out.println(book.toString());
    }
}
