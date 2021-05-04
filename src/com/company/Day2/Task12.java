package com.company.Day2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                count++;
                if (count == number) {
                    break;
                }

            }
            if (count == number) {
                break;
            }
        }
    }
}

