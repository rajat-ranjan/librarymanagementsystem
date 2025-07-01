package org.sample.lms.library;

import org.sample.lms.book.Book;
import org.sample.lms.patron.Patron;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String branchName;
    private Book book;
    private List<Book> books = new ArrayList<>();
    private List<Patron> patrons = new ArrayList<>();;
    private Patron patron;

    public Library(String branchName) {
        this.branchName = branchName;
    }

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
        }
    }

    public void removeBook(Book book) {
        if (book != null) {
            books.remove(book);
        }
    }

    public Book searchByTitle(String title) {
        if (title != null) {
            for(Book book : books){
                if(title.equalsIgnoreCase(book.getBookTitle())){
                    return book;
                }
            }
        }
        return null;
    }

    public Book searchByAuthor(String author) {
        if (author != null)for(Book book : books){
            if(author.equalsIgnoreCase(book.getBookAuthor())){
                return book;
            }
        }
        return null;
    }

    public void addPatron(Patron patron){
        if(patron != null){
            patrons.add(patron);
        }
    }

    public void removePatron(Patron patron){
        if(patron != null){
            patrons.remove(patron);
        }
    }




}
