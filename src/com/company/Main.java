package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the Tic Tac Toe board:");
        new boardState();
        boardState.printBoard();
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter 'u' if you want to start. Enter 'c' if you want the CPU to start.");
        String whoGoesFirst = input.nextLine();
        String whoGoesFirstNow = whoGoesFirst.trim();

        if (whoGoesFirstNow.equals("u")) {
            System.out.println("Too bad, the CPU is going first!");
            boardState.CPUFirst();
        }
        else if (whoGoesFirstNow.equals("c")) {
            System.out.println("The CPU will go first!");
            boardState.CPUFirst();
        }
        else {
            System.out.println("Sorry, that is an invalid input. Goodbye.");
        }
    }
}
