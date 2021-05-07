package com.company.Day4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input matrix length");
        int length = scanner.nextInt();
        int[][] matrix = new int[length][length];
        System.out.println("input ,matrix element");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int matrixElement = scanner.nextInt();
                matrix[i][j] = matrixElement;
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        boolean flag = true;
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-1; j++) {
                if (matrix[i][j]!= matrix[j][i]) {
                    flag=false;
                    break;
                }

            }
        }
        if (flag == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}