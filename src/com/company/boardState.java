package com.company;

import java.util.*;

public class boardState {
    public static String [][] board;
    public static Scanner input = new Scanner(System.in);
    public static boolean test = false;

    public static String userChar = " O ";
    public static String CPUChar = " X ";
    public static String unchanged = " - ";
    public static int xCoord = -1;
    public static int yCoord = -1;



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

    public static void CPUFirst() {
        while(test == false) {
            System.out.println("The top left of the board is (0,0). The bottom right of the board is (2, 2)");

            if (board[0][0].equals(unchanged))
            {
                board[0][0] = CPUChar;
                System.out.println("The CPU's move:");
                printBoard();
                testWin();
                userMove();
            }
            else if (board[0][1].equals(unchanged))
            {
                board[0][1] = CPUChar;
                System.out.println("The CPU's move:");
                printBoard();
                testWin();
                userMove();
            }
            else if (board[1][0].equals(unchanged))
            {
                board[1][0] = CPUChar;
                System.out.println("The CPU's move:");
                printBoard();
                testWin();
                userMove();
            }
            else if (board[0][2].equals(unchanged))
            {
                board[0][2] = CPUChar;
                System.out.println("The CPU's move:");
                printBoard();
                testWin();
                userMove();
            }
            else if (board[2][0].equals(unchanged))
            {
                board[2][0] = CPUChar;
                System.out.println("The CPU's move:");
                printBoard();
                testWin();
                userMove();
            }
            else if (board[1][1].equals(unchanged))
            {
                board[1][1] = CPUChar;
                System.out.println("The CPU's move:");
                printBoard();
                testWin();
                userMove();
            }
            else if (board[2][2].equals(unchanged))
            {
                board[2][2] = CPUChar;
                System.out.println("The CPU's move:");
                printBoard();
                testWin();
                userMove();
            }
            else if (board[2][1].equals(unchanged))
            {
                board[2][1] = CPUChar;
                System.out.println("The CPU's move:");
                printBoard();
                testWin();
                userMove();
            }
            else if (board[1][2].equals(unchanged))
            {
                board[1][2] = CPUChar;
                System.out.println("The CPU's move:");
                printBoard();
                testWin();
                userMove();
            }
            testWin();
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
        String userChar = " O ";
        String CPUChar = " X ";

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

    public static void testWin()
    {
        boolean a = (board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2])) && (board[0][0].equals(" O ") || board[0][0].equals(" X "));
        boolean b = (board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2])) && (board[1][0].equals(" O ") || board[1][0].equals(" X "));
        boolean c = (board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2])) && (board[2][0].equals(" O ") || board[2][0].equals(" X "));
        boolean d = (board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0])) && (board[0][0].equals(" O ") || board[0][0].equals(" X "));
        boolean e = (board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1])) && (board[0][1].equals(" O ") || board[0][1].equals(" X "));
        boolean f = (board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2])) && (board[0][2].equals(" O ") || board[0][2].equals(" X "));
        boolean g = (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) && (board[0][0].equals(" O ") || board[0][0].equals(" X "));
        boolean h = (board[0][2].equals(board[1][1]) && board[2][0].equals(board[0][2])) && (board[0][2].equals(" O ") || board[0][2].equals(" X "));

        if(a || b || c || d || e || f || g || h)
        {
            test = true;
            System.out.println("Game over!");
        }
    }


    /*
    if(test == true)
        {
            break;
        }
     */
}