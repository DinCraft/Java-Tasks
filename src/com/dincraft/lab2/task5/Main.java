package com.dincraft.lab2.task5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[8][8];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(-10, 11);
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isLocalMinimum(matrix, j, i)) {
                    System.out.printf("%3d (%d, %d)\n", matrix[j][i], j, i);
                    total++;
                }
            }
        }
        System.out.println("Total: " + total);
    }

    private static boolean isLocalMinimum(int[][] matrix, int x, int y) {
        if (x == 0 && y != 0 && y != matrix.length - 1) {
            if (matrix[x][y] < matrix[0][y + 1] && matrix[x][y] < matrix[0][y - 1] && matrix[x][y] < matrix[1][y]) {
                return true;
            }
            return false;
        }
        else if (x == matrix.length - 1 && y != 0 && y != matrix.length - 1) {
            if (matrix[x][y] < matrix[matrix.length - 1][y + 1] && matrix[x][y] < matrix[matrix.length - 1][y - 1] && matrix[x][y] < matrix[matrix.length - 2][y]) {
                return true;
            }
            return false;
        }
        else if (y == 0 && x != 0 && x != matrix.length - 1) {
            if (matrix[x][y] < matrix[x + 1][0] && matrix[x][y] < matrix[x - 1][0] && matrix[x][y] < matrix[x][1]) {
                return true;
            }
            return false;
        }
        else if (y == matrix.length - 1 && x != 0 && x != matrix.length - 1) {
            if (matrix[x][y] < matrix[x + 1][matrix.length - 1] && matrix[x][y] < matrix[x - 1][matrix.length - 1] && matrix[x][y] < matrix[y][matrix.length - 2]) {
                return true;
            }
            return false;
        }
        else if (x == 0 && y == 0) {
            if (matrix[x][y] < matrix[0][1] && matrix[x][y] < matrix[1][0]) {
                return true;
            }
            return false;
        }
        else if (x == matrix.length - 1 && y == 0) {
            if (matrix[x][y] < matrix[matrix.length - 1][1] && matrix[x][y] < matrix[matrix.length - 2][0]) {
                return true;
            }
            return false;
        }
        else if (x == 0 && y == matrix.length - 1) {
            if (matrix[x][y] < matrix[0][matrix.length - 2] && matrix[x][y] < matrix[1][matrix.length - 1]) {
                return true;
            }
            return false;
        }
        else if (x == matrix.length - 1 && y == matrix.length - 1) {
            if (matrix[x][y] < matrix[matrix.length - 1][matrix.length - 2] && matrix[x][y] < matrix[matrix.length - 2][matrix.length - 1]) {
                return true;
            }
            return false;
        }
        else {
            if (matrix[x][y] < matrix[x - 1][y] &&
                matrix[x][y] < matrix[x + 1][y] &&
                matrix[x][y] < matrix[x][y - 1] &&
                matrix[x][y] < matrix[x][y + 1])
            {
                return true;
            }
            return false;
        }
    }
}