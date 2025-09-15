package com.dincraft.lab1.task5;

import java.util.Scanner;

public class Main {
    private Scanner in;

    private int[] tickets = new int[2];

    public static void main(String[] args) {
        new Main();
    }
    
    Main(){
        in = new Scanner(System.in);
        System.out.printf("Enter lower border: ");
        tickets[0] = in.nextInt();
        System.out.printf("Enter higher border: ");
        tickets[1] = in.nextInt();
        System.out.println("Lucky tickets: " + showLuckyTicketAmount());
    }

    public int showLuckyTicketAmount(){
        int allTickets = tickets[1] - tickets[0]+1;
        int luckyAmount = 0;

        for (int i = 0; i < allTickets; i++){
            if (checkTicket(Integer.toString(tickets[0] + i))){
                luckyAmount++;
            }
        }

        return luckyAmount;
    }
    
    public boolean checkTicket(String ticketNumber){
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < ticketNumber.length(); i++){
            String number = Character.toString(ticketNumber.charAt(i));
            if (i < ticketNumber.length() - 3){
                sum1 += Integer.parseInt(number);
            }
            else {
                sum2 += Integer.parseInt(number);
            }
        }

        return sum1 == sum2;
    }
}
