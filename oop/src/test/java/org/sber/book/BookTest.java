package org.sber.book;

import org.junit.jupiter.api.Test;

class BookTest {

    private static final Book BOOK = new Book(
            "IT",
            new Author("Stephen King", "Male", "Stephen@king.com"),
            1986
    );

    @Test
    void getTitle() {
        System.out.println(BOOK.getTitle());
    }

    @Test
    void getAuthor() {
        System.out.println(BOOK.getAuthor().toString());
    }

    @Test
    void setYear() {
        BOOK.setYear(2017);
        System.out.println(BOOK.getYear());
    }

    @Test
    void getYear() {
        System.out.println(BOOK.getYear());
    }

    @Test
    void testToString() {
        System.out.println(BOOK.toString());
    }
}
