package com.dincraft.lab4;

public class Reader {
    private String name;
    private Book book;

    public Reader(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void isLate(Date returnDate) {
        if (returnDate.isAfter(book.getReturnDate())) {
            System.out.println(name + " задержал книгу");
        } else {
            System.out.println(name + " не задержал книгу");
        }
    }
}