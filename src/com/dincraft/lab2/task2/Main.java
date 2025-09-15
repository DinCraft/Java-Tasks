package com.dincraft.lab2.task2;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        int max = IntStream.of(array).max().getAsInt();
        System.out.println("max: " + max);
    }
}
