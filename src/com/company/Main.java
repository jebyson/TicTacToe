package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the Tic Tac Toe board:");

        new boardState();

        boardState.printBoard();
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter '0' if you want to start. Enter '1' if you want the CPU to start.");
        int whoGoesFirst = input.nextInt();

        if(whoGoesFirst == 0)
        {
            System.out.println("You will go first!");
            boardState.userFirst();
        }
        else if(whoGoesFirst == 1)
        {
            System.out.println("The CPU will go first!");
            boardState.CPUFirst();
        }
        else
        {
            System.out.println("Sorry, that is an invalid input. Goodbye.");
        }
    }
}
