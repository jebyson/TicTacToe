package com.company;

import java.util.*;

class boardState {
    private static String[][] board;
    private static Scanner input = new Scanner(System.in);
    private static boolean test = false;

    private static String userChar = " O ";
    private static String CPUChar = " X ";
    private static String unchanged = " - ";
    private static int xCoord = -1;
    private static int yCoord = -1;
    private static int cnt = 0;

    boardState()
    {
        board = new String[3][3];
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                board[i][j] = " - ";
            }
        }
    }

    static void CPUFirst()
    {
        while(!test)
        {
            System.out.println("The top left of the board is (0, 0). The bottom right of the board is (2, 2)");

            if(board[0][0].equals(unchanged))
            {
                xCoord = 0;
                yCoord = 0;
                blockWin();
                System.out.println("The CPU's move:");

                printBoard();
                testWin();
                if(test)
                {
                    break;
                }
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
                userMove();
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
            }
            else if (board[0][1].equals(unchanged))
            {
                xCoord = 0;
                yCoord = 1;
                blockWin();
                System.out.println("The CPU's move:");

                printBoard();
                testWin();
                if (test)
                {
                    break;
                }
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
                userMove();
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
            }
            else if (board[0][2].equals(unchanged))
            {
                xCoord = 0;
                yCoord = 2;
                blockWin();
                System.out.println("The CPU's move:");

                printBoard();
                testWin();
                if (test)
                {
                    break;
                }
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
                userMove();
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
            }
            else if (board[1][0].equals(unchanged))
            {
                xCoord = 1;
                yCoord = 0;
                blockWin();
                System.out.println("The CPU's move:");

                printBoard();
                testWin();
                if (test)
                {
                    break;
                }
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
                userMove();
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
            }
            else if (board[2][0].equals(unchanged))
            {
                xCoord = 2;
                yCoord = 0;
                blockWin();
                System.out.println("The CPU's move:");

                printBoard();
                testWin();
                if (test) {
                    break;
                }
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
                userMove();
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
            }
            else if (board[1][1].equals(unchanged))
            {
                xCoord = 1;
                yCoord = 1;
                blockWin();
                System.out.println("The CPU's move:");

                printBoard();
                testWin();
                if (test)
                {
                    break;
                }
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
                userMove();
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
            }
            else if (board[2][1].equals(unchanged))
            {
                xCoord = 2;
                yCoord = 1;
                blockWin();
                System.out.println("The CPU's move:");

                printBoard();
                testWin();
                if (test)
                {
                    break;
                }
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
                userMove();
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
            }
            else if (board[1][2].equals(unchanged))
            {
                xCoord = 1;
                yCoord = 2;
                blockWin();
                System.out.println("The CPU's move:");

                printBoard();
                testWin();
                if (test)
                {
                    break;
                }
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
                userMove();
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
            }
            else if (board[2][2].equals(unchanged))
            {
                xCoord = 2;
                yCoord = 2;
                blockWin();
                System.out.println("The CPU's move:");

                printBoard();
                testWin();
                if (test) {
                    break;
                }
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
                userMove();
                checkTie();
                if(cnt == 9)
                {
                    System.out.println("The game has ended in a tie! Thanks for playing!");
                    break;
                }
            }
            testWin();
        }
    }

    static void printBoard()
    {
        for (int i = 0; i < boardState.board.length; i++)
        {
            for (int j = 0; j < boardState.board.length; j++)
            {
                System.out.print(boardState.board[i][j]);
            }
            System.out.println();
        }
    }

    private static void userMove()
    {
        String userChar = " O ";
        String CPUChar = " X ";

        System.out.println("Please enter the x (row) coordinate of your move.");
        int xCoord = input.nextInt();
        System.out.println("Now enter the y (column) coordinate of your move.");
        int yCoord = input.nextInt();

        if (!(board[xCoord][yCoord].equals(userChar) || board[xCoord][yCoord].equals(CPUChar)))
        {
            board[xCoord][yCoord] = userChar;
            printBoard();
        }
        else
        {
            System.out.println("Invalid move. The CPU receives a free move now!");
        }
    }

    private static void testWin() {
        boolean a = (board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2])) && (board[0][0].equals(" O ") || board[0][0].equals(" X "));
        boolean b = (board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2])) && (board[1][0].equals(" O ") || board[1][0].equals(" X "));
        boolean c = (board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2])) && (board[2][0].equals(" O ") || board[2][0].equals(" X "));
        boolean d = (board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0])) && (board[0][0].equals(" O ") || board[0][0].equals(" X "));
        boolean e = (board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1])) && (board[0][1].equals(" O ") || board[0][1].equals(" X "));
        boolean f = (board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2])) && (board[0][2].equals(" O ") || board[0][2].equals(" X "));
        boolean g = (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) && (board[0][0].equals(" O ") || board[0][0].equals(" X "));
        boolean h = (board[0][2].equals(board[1][1]) && board[2][0].equals(board[0][2])) && (board[0][2].equals(" O ") || board[0][2].equals(" X "));

        if (a || b || c || d || e || f || g || h) {
            test = true;
            System.out.println("Game over! Thanks for playing!");
        }
    }

    private static void blockWin()
    {
        boolean aaa = board[0][0].equals(userChar) && board[0][1].equals(userChar) && board[0][2].equals(unchanged);//1a
        boolean bbb = board[0][0].equals(userChar) && board[0][2].equals(userChar) && board[0][1].equals(unchanged);//2b
        boolean ccc = board[0][1].equals(userChar) && board[0][2].equals(userChar) && board[0][0].equals(unchanged);//3c

        boolean ddd = board[1][0].equals(userChar) && board[1][1].equals(userChar) && board[1][2].equals(unchanged);//4d
        boolean eee = board[1][0].equals(userChar) && board[1][2].equals(userChar) && board[1][1].equals(unchanged);//5e
        boolean fff = board[1][1].equals(userChar) && board[1][2].equals(userChar) && board[1][0].equals(unchanged);//6f

        boolean ggg = board[2][0].equals(userChar) && board[2][1].equals(userChar) && board[2][2].equals(unchanged);//7g
        boolean hhh = board[2][0].equals(userChar) && board[2][2].equals(userChar) && board[2][1].equals(unchanged);//8h
        boolean iii = board[2][1].equals(userChar) && board[2][2].equals(userChar) && board[2][0].equals(unchanged);//9i

        boolean jjj = board[0][0].equals(userChar) && board[1][0].equals(userChar) && board[2][0].equals(unchanged);//10j
        boolean kkk = board[0][0].equals(userChar) && board[2][0].equals(userChar) && board[1][0].equals(unchanged);//11k
        boolean lll = board[1][0].equals(userChar) && board[2][0].equals(userChar) && board[0][0].equals(unchanged);//12l

        boolean mmm = board[0][1].equals(userChar) && board[1][1].equals(userChar) && board[2][1].equals(unchanged);//13m
        boolean nnn = board[0][1].equals(userChar) && board[2][1].equals(userChar) && board[1][1].equals(unchanged);//14n
        boolean ooo = board[1][1].equals(userChar) && board[2][1].equals(userChar) && board[0][1].equals(unchanged);//15o

        boolean ppp = board[0][2].equals(userChar) && board[1][2].equals(userChar) && board[2][2].equals(unchanged);//16p
        boolean qqq = board[0][2].equals(userChar) && board[2][2].equals(userChar) && board[1][2].equals(unchanged);//17q
        boolean rrr = board[1][2].equals(userChar) && board[2][2].equals(userChar) && board[0][2].equals(unchanged);//18r

        boolean sss = board[0][0].equals(userChar) && board[1][1].equals(userChar) && board[2][2].equals(unchanged);//19
        boolean ttt = board[0][0].equals(userChar) && board[2][2].equals(userChar) && board[1][1].equals(unchanged);//20
        boolean uuu = board[1][1].equals(userChar) && board[2][2].equals(userChar) && board[0][0].equals(unchanged);//21

        boolean vvv = board[2][0].equals(userChar) && board[1][1].equals(userChar) && board[0][2].equals(unchanged);//22
        boolean www = board[2][0].equals(userChar) && board[0][2].equals(userChar) && board[1][1].equals(unchanged);//23
        boolean xxx = board[1][1].equals(userChar) && board[0][2].equals(userChar) && board[2][0].equals(unchanged);//24

        if(aaa)
        {
            board[0][2] = CPUChar;
        }
        else if(bbb)
        {
            board[0][1] = CPUChar;
        }
        else if(ccc)
        {
            board[0][0] = CPUChar;
        }
        else if(ddd)
        {
            board[1][2] = CPUChar;
        }
        else if(eee)
        {
            board[1][1] = CPUChar;
        }
        else if(fff)
        {
            board[1][0] = CPUChar;
        }
        else if(ggg)
        {
            board[2][2] = CPUChar;
        }
        else if(hhh)
        {
            board[2][1] = CPUChar;
        }
        else if(iii)
        {
            board[2][0] = CPUChar;
        }
        else if(jjj)
        {
            board[2][0] = CPUChar;
        }
        else if(kkk)
        {
            board[1][0] = CPUChar;
        }
        else if(lll)
        {
            board[0][0] = CPUChar;
        }
        else if(mmm)
        {
            board[2][1] = CPUChar;
        }
        else if(nnn)
        {
            board[1][1] = CPUChar;
        }
        else if(ooo)
        {
            board[0][1] = CPUChar;
        }
        else if(ppp)
        {
            board[2][2] = CPUChar;
        }
        else if(qqq)
        {
            board[1][2] = CPUChar;
        }
        else if(rrr)
        {
            board[0][2] = CPUChar;
        }
        else if(sss)
        {
            board[2][2] = CPUChar;
        }
        else if(ttt)
        {
            board[1][1] = CPUChar;
        }
        else if(uuu)
        {
            board[0][0] = CPUChar;
        }
        else if(vvv)
        {
            board[0][2] = CPUChar;
        }
        else if(www)
        {
            board[1][1] = CPUChar;
        }
        else if(xxx)
        {
            board[2][0] = CPUChar;
        }
        else
        {
            board[xCoord][yCoord] = CPUChar;
        }
    }

    private static void checkTie()
    {
        cnt = 0;
        for (String[] dummyVar : board) {
            for (int b = 0; b < board[0].length; b++) {
                if (!(dummyVar[b].equals(unchanged))) {
                    cnt++;
                }
            }
        }
    }
}
