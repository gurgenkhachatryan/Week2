package com.company.Day1;

import java.util.Scanner;

// smallest natural divisor //
public class Task4 {
    public static void main(String[] args) {
        System.out.println("input number greater 2");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                ;
                System.out.println("SmallNaturalDivisor=" + i);
                break;
            }
        }
    }
}
