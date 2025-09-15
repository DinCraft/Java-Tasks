package com.dincraft.lab2.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("A: ");
        int a = scanner.nextInt();
        System.out.printf("B: ");
        int b = scanner.nextInt();
        System.out.printf("E: ");
        int e = scanner.nextInt();
        float[][] matrix = new float[4][(b - a) / e];
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = a + i * e;
            matrix[1][i] = f1(matrix[0][i]);
            matrix[2][i] = f2(matrix[0][i]);
            matrix[3][i] = f3(matrix[0][i]);
        }
        System.out.println("x | f1 | f2 | f3");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.printf("%2.0f | %5.2f %5.2f %5.2f\n", matrix[0][i], matrix[1][i], matrix[2][i], matrix[3][i]);
        }
    }

    private static float f1(float x) {
        return (float) Math.pow(x, 2) - 10*x + 15;
    }

    private static float f2(float x) {
        return (float) Math.sin(x + Math.PI / 3);
    }

    private static float f3(float x) {
        return (float) Math.pow(Math.E, Math.sqrt(x));
    }
}