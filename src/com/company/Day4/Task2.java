package com.company.Day4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input matrix length");
        int length = scanner.nextInt();
        int[][] matrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i + j) == (length - 1)) {
                    matrix[i][j] = 1;
                } else if ((i + j) > length - 1) {
                    matrix[i][j] = 2;
                } else {
                    matrix[i][j] = 0;
                }

            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
