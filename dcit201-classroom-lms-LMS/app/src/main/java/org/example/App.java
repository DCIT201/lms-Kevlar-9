/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Library library = new Library("City Library");

        // Adding books to the library
        Book book1 = new Book("Java Programming", "John Doe", 1949);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 1949);
        Book book3 = new Book("Clean Code", "Robert C. Martin", 1949);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Registering a patron
        Patron patron = new Patron("Alice", "P001");
        library.registerPatron(patron);

        // Patron borrows a book
        library.borrowBook("Java Programming", patron);

        // Display borrowed books for the patron
        System.out.println("Borrowed books by Alice:");
        for (Book b : patron.getBorrowedBooks()) {
            System.out.println(b.getTitle());
        }

        // Patron returns a book
        library.returnBook("Java Programming");

        // Display available books in the library
        System.out.println("Available books in the library:");
        for (Book b : library.getAvailableBooks()) {
            System.out.println(b.getTitle());
        }
    }
}

