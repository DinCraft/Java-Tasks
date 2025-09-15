package com.dincraft.lab1.task3;

public class Main {
    public static void main(String[] args) {
        String[][] table = new String[][] {
            {"№", "Ключ", "Количество переходов"},
            {"1", "Купить квартиру недорого", "225 406"},
            {"2", "Купить квартиру в Ярославле", "137 489"},
            {"3", "Купить квартиру без посредников", "87 478"}
        };
        printSeparator();
        System.out.printf("| %s |                  %s                  | %s |\n", table[0][0], table[0][1], table[0][2]);
        for (int i = 1; i < table.length; i++) {
            printSeparator();
            System.out.printf("| %s | %-38s | %20s |\n", table[i][0], table[i][1], table[i][2]);
        }
        printSeparator();
    }

    private static void printSeparator() {
        System.out.printf("|");
        for (int j = 0; j < 3; j++) {
            System.out.printf("-");
        }
        System.out.printf("|");
        for (int j = 0; j < 40; j++) {
            System.out.printf("-");
        }
        System.out.printf("|");
        for (int j = 0; j < 22; j++) {
            System.out.printf("-");
        }
        System.out.printf("|\n");
    }
}
