package com.dincraft.lab2.task4;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        int[] filtered = filter(array);
        filtered = IntStream.of(filtered).sorted().toArray();
        int[] sorted = new int[filtered.length];
        for (int i = 0; i < filtered.length; i++) {
            sorted[filtered.length - 1 - i] = filtered[i];
        }
        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }

    private static int[] filter(int[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            String s = String.valueOf(array[i]);
            if (s.charAt(s.length() - 1) == '3') {
                length++;
            }
        }
        int[] result = new int[length];
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            String s = String.valueOf(array[i]);
            if (s.charAt(s.length() - 1) == '3') {
                result[c] = array[i];
                c++;
            }
        }
        return result;
    }
}
