package org.sample.lms;

import org.sample.lms.book.Book;
import org.sample.lms.book.BookFactory;
import org.sample.lms.library.Library;
import org.sample.lms.patron.Patron;

public class Controller {

    public static void main(String[] args) {

        //Creating new books
        Book book1 = BookFactory.createBook("Rich Dad Poor Dad", "Talks about Money Management", "Robert", "test1", 1997);
        Book book2 = BookFactory.createBook("Do Epic Shit", "Talks about Time Management", "Ankur", "test2", 2022);
        Book book3 = BookFactory.createBook("Friends", "Tells about friend and friendship", "XYZ", "test3", 1990);
        Book book4 = BookFactory.createBook("Rich Dad Poor Dad", "Talks about Money Management", "Robert", "test4", 1997);

        //Creating new Patrons

        Patron patron = new Patron("patron-1", "Rajat Ranjan");
        Patron patron1 = new Patron("patron-2", "Rajiv Ranjan");
        Patron patron2 = new Patron("patron-3", "Sathya Ranjan");

        Library library = new Library("Bangalore");

        //adding books into library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        //adding patrons into library
        library.addPatron(patron);
        library.addPatron(patron1);
        library.addPatron(patron2);

        book1.displayBookDetails();



        patron.borrowBook(book1);
        patron.borrowBook(book2);
        patron.borrowBook(book3);

        patron.getBorrowedBooksForPatron();
        System.out.println("Book borrowed by " + patron.getPatronName() + " - " + patron.getBorrowedBooks().size());


    }
}
