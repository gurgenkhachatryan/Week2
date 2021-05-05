package com.company.Day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("input Array size");
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int matrix[] = new int[sizeArray];
        System.out.println("input element");
        for (int i = 0; i < sizeArray; i++) {
            int number = scanner.nextInt();
            matrix[i] = number;
        }
        for (int j = 0; j < matrix[sizeArray - 1]; j += 2) {
            System.out.print(matrix[j] + " ");
        }
    }
}
