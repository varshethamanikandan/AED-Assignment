package edu.neu.mgen;

public class Chap7 {
    
  
        public static void main(String[] args) {
            // Matrices
            int[][] A = {{2, 3, 4},
                         {3, 4, 5}};
    
            int[][] B = {{1, 2},
                         {3, 4},
                         {5, 6}};
    
            // Check if matrices can be multiplied
            if (A[0].length != B.length) {
                System.out.println("Matrices cannot be multiplied.");
                return;
            }
    
            // Initialize the result matrix with zeros
            int[][] result = new int[A.length][B[0].length];
    
            // Perform matrix multiplication
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < B.length; k++) {
                        result[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
    
            // Output the result
            System.out.println("Result of matrix multiplication:");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    