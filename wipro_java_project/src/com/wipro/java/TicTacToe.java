package com.wipro.java;

import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        playGame();
    }

    // Initialize board with empty spaces
    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Main game loop
    private static void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        int moveCount = 0;

        while (!gameWon && moveCount < SIZE * SIZE) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter row and column (0-2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                moveCount++;

                if (checkWinner(row, col)) {
                    gameWon = true;
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                } else if (moveCount == SIZE * SIZE) {
                    printBoard();
                    System.out.println("It's a draw!");
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch player
                }
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
        scanner.close();
    }

    // Check if the move is valid
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == ' ';
    }

    // Check if the current player has won
    private static boolean checkWinner(int row, int col) {
        return checkRow(row) || checkColumn(col) || checkDiagonals();
    }

    private static boolean checkRow(int row) {
        return board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer;
    }

    private static boolean checkColumn(int col) {
        return board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer;
    }

    private static boolean checkDiagonals() {
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
               (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    // Print the Tic Tac Toe board
    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }
}
