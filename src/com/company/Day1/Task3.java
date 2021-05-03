package com.company.Day1;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
                  //squares of natural numbers//
public class Task3 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number / 2; i++) {
            if (i * i < number) {
                System.out.print(i * i + " ");
            }

        }
    }
}
