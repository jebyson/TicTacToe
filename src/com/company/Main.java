package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        for(int j = 0; j <= 1; j++)
        {
            System.out.println("This is the Tic Tac Toe board:");

            boardState game = new boardState();

            game.printBoard();
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter '0' if you want to start. Enter '1' if you want the CPU to start.");
            String whoGoesFirst = input.nextLine();
            whoGoesFirst = whoGoesFirst.trim();
            int whoFirst = Integer.parseInt(whoGoesFirst);

            if (whoFirst == 0)
            {
                System.out.println("Too bad, the CPU is going first!");
                game.CPUFirst();
            }
            else if (whoFirst == 1)
            {
                System.out.println("The CPU will go first!");
                game.CPUFirst();
            }
            else
            {
                System.out.println("Sorry, that is an invalid input. Goodbye.");
            }

            Scanner finalInput = new Scanner(System.in);
            System.out.println("\nEnter '0' if you want to play again. Enter '1' if you want to quit.");
            String playAgain = finalInput.nextLine();
            playAgain = playAgain.trim();
            int playOrNah = Integer.parseInt(playAgain);

            if (playOrNah == 1)
            {
                j++;
                System.out.println("Goodbye!");
            }
            else if (playOrNah != 0)
            {
                j++;
                System.out.println("Invalid input. Goodbye!");
            }
        }
    }
}
