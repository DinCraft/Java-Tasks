package com.dincraft.lab3;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(54, 400);
        Bus bus2 = new Bus(45, 500);
        bus1.setTakenSeats(25);
        bus2.setTakenSeats(30);
        System.out.println(bus1.getTotalCost());
        System.out.println(bus2.getTotalCost());
    }
}