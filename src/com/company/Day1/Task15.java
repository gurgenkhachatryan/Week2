package com.company.Day1;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("input numbers");
        Scanner scanner = new Scanner(System.in);
        int number;
        int max = 0;
        int secondMax = 0;
        int tiv;
        for (; ; ) {
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println(secondMax);
                break;
            }
            if (max <= number) {
                tiv = max;
                max = number;
                if (tiv < max) {
                    secondMax = tiv;
                }
            } else if (secondMax < number) {
                secondMax = number;
            }
        }
    }
}