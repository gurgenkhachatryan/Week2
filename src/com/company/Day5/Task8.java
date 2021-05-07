package com.company.Day5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b1 = scanner.nextInt();
        int q = scanner.nextInt();
        int n = scanner.nextInt();
        int bn = 0;
        for (int i =1; i <= n; i *= q) {

            bn = b1*i * q;

        }
        System.out.println(bn);
    }
}