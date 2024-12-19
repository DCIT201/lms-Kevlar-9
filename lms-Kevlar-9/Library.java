package org.example;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<Book> books;
    private List<Patron> patrons;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    public void borrowBook(String title, Patron patron) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.borrowBook();
                patron.borrowBook(book);
                System.out.println("Book borrowed successfully.");
                return;
            }
        }
        System.out.println("Book not available or not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isAvailable()) {
                book.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found or already returned.");
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }}
