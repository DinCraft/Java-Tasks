package com.dincraft.lab4;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров");
        Reader reader2 = new Reader("Васечкин");
        Book book1 = new Book("Java 8. Полное руководство", "Г. Шилдт", new Date(1, 4));
        Book book2 = new Book("Крейцерова соната", "Л. Толстой", new Date(25, 3));
        reader1.setBook(book1);
        reader2.setBook(book2);
        Date returnDate = new Date(29, 3);
        reader1.isLate(returnDate);
        reader2.isLate(returnDate);
    }
}