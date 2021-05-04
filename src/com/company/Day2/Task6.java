package com.company.Day2;

import java.util.Scanner;

///Find the smallest natural divisor//
public class Task6 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 2; i <= 30000; i++) {
            if (number % i == 0) {
                System.out.println("number=" + number + "    i=" + i);
                break;
            }
        }

    }
}
