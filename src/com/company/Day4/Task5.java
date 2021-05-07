package com.company.Day4;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input matrix length");
        int matrixlengthi = scanner.nextInt();
        int matrixlengthj = scanner.nextInt();
        int[][] matrix = new int[matrixlengthi][matrixlengthj];
        Random random = new Random();
        int max = 0;
        int indexi = 0;
        int indexj = 0;
        for (int i = 0; i < matrixlengthi; i++) {
            for (int j = 0; j < matrixlengthj; j++) {
                matrix[i][j] = random.nextInt(80);
            }
        }
        for (int i = 0; i < matrixlengthi; i++) {
            System.out.println();
            for (int j = 0; j < matrixlengthj; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        for (int i = 0; i < matrixlengthi; i++) {
            for (int j = 0; j < matrixlengthj; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    indexi = i;
                    indexj = j;

                }

            }
        }
        System.out.println("max=" + max + " index=" + indexi + "," + indexj);
    }
}