
package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("Pride and Prejudice", "Jane Austen",  1813));
        library.addBook(new Book("Moby-Dick", "Herman Melville", 1851));
        library.addBook(new Book("TThe Road", "Cormac McCarthy", 2006));
        library.addBook(new Book("The Kite Runnern", "Khaled Hosseini", 2003));
        library.addBook(new Book("The Book Thief", "Markus Zusak", 2005));


        String star = "******************************";

        //Showing the list of books in the library
        System.out.println(star);
        System.out.println("       Books in the Library");
        System.out.println(star);
        library.listBooks();
        System.out.println();

        // Creating a patron and borrowing a book
        Patron patron = new Patron("Francis Siripi ", 142625);

        Book bookToBorrow = library.findBookByTitle("The Book Thief");
        patron.borrowBook(bookToBorrow, library);
        System.out.println();

        // Showing the list of borrowed books
        System.out.println(star);
        System.out.println("   Borrowed Books");
        System.out.println(star);
        patron.listBorrowedBooks();
        System.out.println();

        // Returning the  book that was borrowed
        patron.returnBook(bookToBorrow, library);
        System.out.println();

        // Showing the list of books in the library after operations
        System.out.println(star);
        System.out.println("Books in the Library After Operations");
        System.out.println(star);
        library.listBooks();
        System.out.println();

        // Showing the detailed list of books with titles and years
        System.out.println(star);
        System.out.println("   Detailed List of Books");
        System.out.println(star);
        library.listBooksTitlesAndYears();
    }
}
