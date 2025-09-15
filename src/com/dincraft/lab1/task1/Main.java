package com.dincraft.lab1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер года: ");
        int year = scanner.nextInt();

        int animalIndex = (year - 1996) % 12;
        if (animalIndex < 0) {
            animalIndex += 12;
        }

        String animalName = switch (animalIndex) {
            case 0 -> "Крысы";
            case 1 -> "Коровы";
            case 2 -> "Тигра";
            case 3 -> "Зайца";
            case 4 -> "Дракона";
            case 5 -> "Змеи";
            case 6 -> "Лошади";
            case 7 -> "Овцы";
            case 8 -> "Обезьяны";
            case 9 -> "Курицы";
            case 10 -> "Собаки";
            case 11 -> "Свиньи";
            default -> "Неизвестно"; // Эта строка никогда не выполнится из-за проверки выше, но требуется синтаксисом
        };

        System.out.println(year + " год - год " + animalName);
    }
}