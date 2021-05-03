package com.company.Day1;

import java.util.Scanner;
                        //athlete //
public class Task13 {
    public static void main(String[] args) {
        System.out.println("input x km");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        int y = scanner.nextInt();
        int count = 1, x1;
        while (x <= y) {
            x = (x + (x * 10) / 100);
            // x*=1.1;
            System.out.println("x=" + x);
            count++;
        }
        System.out.println("count=" + count);
    }
}
