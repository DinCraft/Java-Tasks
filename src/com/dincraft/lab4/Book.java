package com.dincraft.lab4;

public class Book {
    private String title;
    private String author;
    private Date returnDate;

    public Book(String title, String author, Date returnDate) {
        this.title = title;
        this.author = author;
        this.returnDate = returnDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }


}