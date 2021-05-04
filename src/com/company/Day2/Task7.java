package com.company.Day2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + ",");
                count++;
            }
        }
        System.out.println();
        System.out.println("count=" + count);
    }
}
