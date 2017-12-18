package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the Tic Tac Toe board:");

        new boardState();

        for(int i = 0; i < boardState.board.length; i++)
        {
            for(int j = 0; j < boardState.board.length; j++)
            {
                System.out.print(boardState.board[i][j]);
            }
            System.out.println();
        }
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter '0' if you want to start. Enter '1' if you want the CPU to start.");
        int whoGoesFirst = input.nextInt();

        if(whoGoesFirst == 0)
        {
            System.out.println("You will go first!");
        }
        else if(whoGoesFirst == 1)
        {
            System.out.println("The CPU will go first!");
        }
        else
        {
            System.out.println("That is an invalid input. Sorry. Goodbye.");
        }

    }
}
