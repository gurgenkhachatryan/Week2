package com.company.Day5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number1 = scanner.nextInt();
            for (int i = number; i <= number1; i++) {
            int d = i % 10;
            int c = (i % 100)/10;
            int b = (i % 1000)/100;
            int a = i / 1000;
            if ((a == d) && (b == c)) {
                System.out.println(i);
            }


        }
    }
}