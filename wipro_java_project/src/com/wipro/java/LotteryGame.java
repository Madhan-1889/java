package com.wipro.java;

import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class LotteryGame {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/LotteryGameDB";
    private static final String JDBC_USER = "root"; // Change if needed
    private static final String JDBC_PASS = "madhan2023"; // Change if needed

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.print("Pick a number (1-100): ");
        int chosenNumber = scanner.nextInt();

        int winningNumber = random.nextInt(100) + 1; // Random number between 1-100
        String result = (chosenNumber == winningNumber) ? "Win" : "Loss";

        System.out.println("\nThe winning number was: " + winningNumber);
        if (result.equals("Win")) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Better luck next time.");
        }

        saveResult(playerName, chosenNumber, winningNumber, result);
        scanner.close();
    }

    private static void saveResult(String name, int chosenNumber, int winningNumber, String result) {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO lottery_results (player_name, chosen_number, winning_number, result) VALUES (?, ?, ?, ?)")) {

            stmt.setString(1, name);
            stmt.setInt(2, chosenNumber);
            stmt.setInt(3, winningNumber);
            stmt.setString(4, result);
            stmt.executeUpdate();
            System.out.println("\nYour result has been saved in the database.");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
