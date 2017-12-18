package com.company;

import java.util.*;

public class boardState {
    public static String [][] board;
    public static Scanner input = new Scanner(System.in);

    public boardState()
    {
        board = new String [3][3];
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                board[i][j] = " - ";
            }
        }
    }

    public static void userFirst()
    {
        String userChar = " X ";
        String CPUChar = " O ";
        String unchanged = " - ";

        System.out.println("The top left of the board is (0,0). The bottom right of the grid is (2, 2)");
        System.out.println("Please enter the x (row) coordinate of your move.");
        int xCoord = input.nextInt();
        System.out.println("Now enter the y (column) coordinate of your move.");
        int yCoord = input.nextInt();


        if(!(xCoord < 0 || xCoord > 2 || yCoord < 0 || yCoord > 2))
        {
            board[xCoord][yCoord] = userChar;
            printBoard();
            System.out.println();

            if(board[0][0].equals(unchanged))
            {
                board[0][0] = CPUChar;
                System.out.println("The CPU's move:");
                printBoard();

                userMove();
            }
        }
        else
        {
            System.out.println("Sorry, that is an invalid input. Goodbye.");
        }
    }

    public static void CPUFirst()
    {
        String userChar = " O ";
        String CPUChar = " X ";
        String unchanged = " - ";

        System.out.println("The top left of the board is (0,0). The bottom right of the grid is (2, 2).");
        System.out.println("Please enter the x coordinate of your first move.");
        int xCoord = input.nextInt();
        System.out.println("Now enter the y coordinate of your first move.");
        int yCoord = input.nextInt();

        if(xCoord < 0 || xCoord > 2 || yCoord < 0 || yCoord > 2)
        {
            System.out.println("Sorry, that is an invalid input. Goodbye.");
        }
        else
        {

        }
    }

    public static void printBoard()
    {
        for(int i = 0; i < boardState.board.length; i++)
        {
            for(int j = 0; j < boardState.board.length; j++)
            {
                System.out.print(boardState.board[i][j]);
            }
            System.out.println();
        }
    }

    public static void userMove()
    {
        String userChar = " X ";
        String CPUChar = " O ";

        System.out.println("Please enter the x (row) coordinate of your move.");
        int xCoord = input.nextInt();
        System.out.println("Now enter the y (column) coordinate of your move.");
        int yCoord = input.nextInt();

        if(!(board[xCoord][yCoord].equals(userChar) || board[xCoord][yCoord].equals(CPUChar)))
        {
            board[xCoord][yCoord] = userChar;
            printBoard();
        }
        else
        {
            System.out.println("Invalid move. Goodbye.");
        }

    }
}