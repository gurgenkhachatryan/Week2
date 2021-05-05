package com.company.Day3;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLangth = scanner.nextInt();
        int[] array = new int[arrayLangth];
        System.out.println("input arrayelement");
        for (int i = 0; i < arrayLangth; i++) {
            int arrayelement = scanner.nextInt();
            array[i] = arrayelement;
        }

        int max = 0;
        for (int i = 0; i < arrayLangth; i++) {
            if (array[i + 1] > array[i]) {
                max = array[i + 1];
                if (max == array[arrayLangth-1]) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
