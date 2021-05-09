package com.company.Day5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int gum = 1;
        if (n <= 0 || n > 15) {
            System.out.println("invalid number");
        } else {
            for (int i = 1; i <= n; i++) {
                gum *= 2;
                System.out.println("gum=" + gum);
            }
            //System.out.println("gum=" + gum);
        }
    }
}