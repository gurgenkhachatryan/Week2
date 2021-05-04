package com.company.Day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("input 2 numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int count = 0;
        for (; number1 != 0;number1/=10 ) {
            if (number1 % 10 == number2) {
                count++;
            }

        }
        System.out.println(count);
    }
}
