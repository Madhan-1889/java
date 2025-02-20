package com.wipro.java.practice;

import java.util.Scanner;

public class UseCase1 {
    
    // Function to count valid pairs
    public static int countPairs(int N, int[] A) {
        int count = 0;
        
        // Loop through all pairs
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                
                // Find the minimum height between A[i] and A[j]
                int minHeight = Math.min(A[i], A[j]);
                
                // Check if all elements between A[i] and A[j] are smaller than minHeight
                boolean isValid = true;
                for (int k = i + 1; k < j; k++) {
                    if (A[k] >= minHeight) {
                        isValid = false;
                        break;
                    }
                }
                
                // If valid pair, increment the count
                if (isValid) {
                    count++;
                }
            }
        }
        
        return count;
    }

    // Main function to read input and call countPairs
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of students (array length)
        int N = Integer.parseInt(scanner.nextLine());
        
        // Read the heights of the students
        int[] A = new int[N];
        String[] temp = scanner.nextLine().split(" ");
        
        // Parse heights into array A
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(temp[i]);
        }
        
        // Call the countPairs function and print the result
        System.out.println(countPairs(N, A));
    }
}
