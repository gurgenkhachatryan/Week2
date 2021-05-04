package com.company.Day2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print("*|");
        for (int k = 1; k <= number; k++) {
            System.out.print(k + " ");
        }
        System.out.println();
        for (int l = 1; l <= number; l++) {
            System.out.print("---");
        }
            for (int i = 1; i <= number; i++) {
                System.out.println();
                System.out.print(i + "|");
                for (int j = 1; j <= number; j++) {
                    System.out.print( i * j + " ");
                }
            }
        }
    }

