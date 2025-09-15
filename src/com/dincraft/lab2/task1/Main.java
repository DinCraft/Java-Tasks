package com.dincraft.lab2.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        List<Integer> symmetricList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String sNumber = String.valueOf(array[i]);
            StringBuilder sb = new StringBuilder(sNumber);
            sb.reverse();
            if (sNumber.equals(sb.toString())) {
                symmetricList.add(array[i]);
            }
        }
        int sum = 0;
        for (Integer i : symmetricList) {
            sum += i;
        }
        System.out.println("sum: " + sum);
    }
}