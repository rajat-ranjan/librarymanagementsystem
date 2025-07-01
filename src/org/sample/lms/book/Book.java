package org.sample.lms.book;

public class Book {

    private String bookTitle;
    private String bookDescription;
    private String bookAuthor;
    private String bookISBN;
    private int yearOfPublication;
    private boolean isAvailable;

    public Book(String bookTitle, String bookDescription, String bookAuthor, String bookISBN, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.bookDescription = bookDescription;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void displayBookDetails(){
        System.out.println(" Book Title : " + this.getBookTitle());
        System.out.println(" Book Description : " + this.getBookDescription());
        System.out.println(" Book Author : " + this.getBookAuthor());
        System.out.println(" Book ISBN : " + this.getBookISBN());
        System.out.println(" Book Year of publication : " + this.getYearOfPublication());
    }

}
