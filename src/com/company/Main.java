package com.company; 

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the Tic Tac Toe board:");
        new boardState();
        boardState.printBoard();
        System.out.println("\nThe CPU will go first!");
        boardState.CPUFirst();
    }
}
