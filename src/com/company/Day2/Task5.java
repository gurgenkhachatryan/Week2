package com.company.Day2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("int number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverseNumber = 0;
        for (; number != 0; number /= 10) {
            int mijankyal;
            mijankyal = number % 10;
            reverseNumber = (reverseNumber * 10) + mijankyal;
        }
        System.out.println("reverseNumber=" + reverseNumber);
    }
}
