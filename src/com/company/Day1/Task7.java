package com.company.Day1;

import java.util.Scanner;
 // ultiple of        2 in descending order //
public class Task7 {
    public static void main(String[] args) {
        System.out.println("print input");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int tiv = number; tiv > 0; tiv--) {
            if (tiv % 2 == 0) {
                System.out.print(tiv + " ");
            }
        }
    }
}