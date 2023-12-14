package com.ibm.enity;

public class Book {
    private int ISBNNumber;
    private String bookName;
    private String authorName;

    public Book() {
    }

    public Book(int ISBNNumber, String bookName, String authorName) {
        this.ISBNNumber = ISBNNumber;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public int getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(int ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
