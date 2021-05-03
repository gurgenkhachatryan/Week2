package com.company.Day1;

import java.util.Scanner;
//sum of digits of the number//
public class Task17 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number /= 10;
        }
        System.out.println("sum=" + sum);
    }
}
