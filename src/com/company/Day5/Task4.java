package com.company.Day5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean k = false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if ((number % i) == 0) {

                k = true;
            }

        }
        if (k) {
            System.out.println("parz che");
        } else {
            System.out.println("parze");
        }
    }
}