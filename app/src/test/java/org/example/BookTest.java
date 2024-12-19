/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BookTest {
    @Test void testBookConstructor() {
        // Creating a book record
        Book book = new Book("1984", "George Orwell", 1949);

        // Using the implicitly created methods from the record
        assertEquals("1984", book.title());
        assertEquals("George Orwell", book.author());
        assertEquals(1949, book.yearPublished());
    }
}