package com.company.Day2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println();
            for (int j = 0; j < number; j++) {
                System.out.print("* ");
            }
        }
    }
}
