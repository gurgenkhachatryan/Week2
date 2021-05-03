package com.company.Day1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 1;
        int qayl = 1;
        label:
        while (count != number) {
            int astichan = 0;
            while (count <= number) {
                if (count == number) {
                    System.out.println("astichan=" + astichan);
                    System.out.println("qajl=" + qayl);
                    break label;
                } else {
                    astichan++;
                    count = count * 2;
                }
            }
            System.out.println("input number");
            number = scanner.nextInt();
            count = 1;
            qayl++;

        }
    }
}