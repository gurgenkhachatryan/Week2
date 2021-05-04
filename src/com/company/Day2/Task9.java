package com.company.Day2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("input 10 numbers");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("sum=" + sum);
    }
}
