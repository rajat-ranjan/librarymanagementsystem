package org.sample.lms.book;

public class BookFactory {

    public static Book createBook(String title, String descripition, String author, String isbn, int year) {
        return new Book(title, descripition, author, isbn, year);
    }
}
