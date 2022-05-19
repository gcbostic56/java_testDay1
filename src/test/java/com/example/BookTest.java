package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BookTest {
    @Test
    void testBookName() {
        Book newBook = new Book("Dune", 1034);
        assertEquals("Dune", newBook.getTitle());
    }
    void testBookPages() {
        Book newBook = new Book("Dune", 1034);
        assertEquals(1034, newBook.getPages());
    }
    void testBookYear() {
        Book newBook = new Book(1972);
        assertEquals(1972, newBook.getYear());
    }
}
