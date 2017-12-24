package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        for(int j = 0; j < 1; j +=0) {
            System.out.println("This is the Tic Tac Toe board:");

            boardState tester = new boardState();

            tester.printBoard();
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter '0' if you want to start. Enter '1' if you want the CPU to start.");
            int whoGoesFirst = input.nextInt();

            if (whoGoesFirst == 0)
            {
                System.out.println("Too bad, the CPU is going first!");
                tester.CPUFirst();
            }
            else if (whoGoesFirst == 1) {
                System.out.println("The CPU will go first!");
                tester.CPUFirst();
            }
            else {
                System.out.println("Sorry, that is an invalid input. Goodbye.");
                break;
            }

            System.out.println("\nIf you would like to play again, enter '0'. If you would like to quit, enter '1'.");
            int playAgain = input.nextInt();

            if(playAgain == 0)
            {
                System.out.println("Thanks for playing again!\n");
            }
            else if(playAgain == 1)
            {
                System.out.println("Thanks for playing. Goodbye.");
                break;
            }
            else
            {
                System.out.println("Sorry, that is an invalid input. Goodbye.");
                break;
            }
        }
    }
}
