package com.company.Day1;

import java.util.Scanner;

//Math.pow(2,k)≥N //
public class Task9 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        for (int tiv = 2; tiv <= number; tiv *= 2) {

            System.out.print(tiv + " ,");
            count++;
        }
        System.out.println("count=" + (count + 1));
    }
}
