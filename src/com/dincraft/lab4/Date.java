package com.dincraft.lab4;

public class Date {
    private int day;
    private int month;

    public Date(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public boolean isAfter(Date date) {
        if (month == date.month) {
            if (day > date.day) {
                return true;
            }
            return false;
        } else if (month > date.month) {
            return true;
        } else {
            return false;
        }
    }
}
