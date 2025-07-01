package org.sample.lms.patron;

import org.sample.lms.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Patron {

    private String patronID;
    private String patronName;
    private List<Book> borrowedBooks = new ArrayList<>();


    public Patron(String patronID, String patronName) {
        this.patronID = patronID;
        this.patronName = patronName;
    }

    public String getPatronID() {
        return patronID;
    }

    public void setPatronID(String patronID) {
        this.patronID = patronID;
    }

    public String getPatronName() {
        return patronName;
    }

    public void setPatronName(String patronName) {
        this.patronName = patronName;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book){
        if (book != null){
           borrowedBooks.add(book);
        }
    }

    public void returnBook(Book book){
        if (book != null){
            borrowedBooks.remove(book);
        }
    }

    public void getBorrowedBooksForPatron(){
        System.out.println("Book Details : " );
        for (Book book : borrowedBooks){
            System.out.println(book.getBookTitle());
            System.out.println(book.getBookDescription());
            System.out.println(book.getBookAuthor());
            System.out.println(book.getBookISBN());
            System.out.println(book.getYearOfPublication());
        }
    }
}
