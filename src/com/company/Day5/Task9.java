package com.company.Day5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = 2;
        System.out.print(number + "=");
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                number /= i;
                System.out.print(i + ",");
            }
        }
    }
}
