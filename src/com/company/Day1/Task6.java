package com.company.Day1;

import java.util.Scanner;

//integers in descending order//
public class Task6 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = number; i >= 0; i--) {
            System.out.print(i + ",");
        }
    }
}
