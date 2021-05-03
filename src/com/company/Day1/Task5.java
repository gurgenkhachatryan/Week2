package com.company.Day1;

import java.util.Scanner;
 ///powers of two///
public class Task5 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int tiv = 1; tiv < number; tiv *= 2) {
            System.out.print(tiv + ",");

        }
    }
}
