package com.dincraft.lab3;

public class Bus {
    private int seats;
    private int seatCost;
    private int takenSeats;

    enum State {
        EMPTY, FULL, UNDEFINED
    }

    Bus() {
        this.seats = 0;
        this.seatCost = 0;
        this.takenSeats = 0;
    }

    Bus(int seats, int seatCost) {
        this.seats = seats;
        this.seatCost = seatCost;
        this.takenSeats = 0;
    }

    Bus(Bus bus) {
        this.seats = bus.getSeats();
        this.seatCost = bus.getSeatCost();
        this.takenSeats = bus.getTakenSeats();
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeatCost() {
        return seatCost;
    }

    public void setSeatCost(int seatCost) {
        this.seatCost = seatCost;
    }

    public int getTakenSeats() {
        return takenSeats;
    }

    public void setTakenSeats(int takenSeats) {
        this.takenSeats = takenSeats;
    }

    public int getFreeSeats() {
        return seats - takenSeats;
    }

    public State getState() {
        if (seats == takenSeats) {
            return State.FULL;
        } else if (takenSeats == 0) {
            return State.EMPTY;
        } else {
            return State.UNDEFINED;
        }
    }

    public int getTotalCost() {
        return seatCost * seats;
    }
}