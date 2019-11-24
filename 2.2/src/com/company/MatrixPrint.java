package com.company;

import java.sql.SQLOutput;

public class MatrixPrint {
    public static void main(String args[]) {
        //PUT YOUR CODE HERE
        // PUT YOUR CODE HERE
        int count = 0;
        int matrix[][] = new int[5][5];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {

                matrix[i][j] = ++count;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {

                if (i == j|| i+j == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();

        }
    }
}
