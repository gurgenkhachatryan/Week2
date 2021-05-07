package com.company.Day5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbermatrix = scanner.nextInt();
        char[][] matrix = new char[numbermatrix][numbermatrix];
        char krestik = 'X';
        char nolikin = 'O';
        for (int i = 0; i < numbermatrix; i++) {
            for (int j = 0; j < numbermatrix; j ++) {
                if (j % 2 == 0)
                {matrix[i][j] = nolikin;}
                 else{
                    matrix[i][j] = krestik;
                }
            }
        }
            for (int i = 0; i < numbermatrix; i++) {
                System.out.println();
                for (int j = 0; j < numbermatrix; j++) {
                    System.out.print(matrix[i][j] + " ");
                }

            }
        }
    }
