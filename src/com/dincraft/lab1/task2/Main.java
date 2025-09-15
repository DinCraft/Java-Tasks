package com.dincraft.lab1.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("ТАБЛИЦА УМНОЖЕНИЯ (в виде таблицы)");
        System.out.println("===================================");
        
        System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        
        System.out.print("---+");
        for (int i = 1; i <= 9; i++) {
            System.out.print("----");
        }
        System.out.println();
        
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        System.out.println("Таблица умножения в текстовом виде:");
        System.out.println("-----------------------------------");
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}