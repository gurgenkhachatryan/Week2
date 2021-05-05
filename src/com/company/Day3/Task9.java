package com.company.Day3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input array length");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("input array element");
        for (int i = 0; i < arrayLength; i++) {
            int arrayElement = scanner.nextInt();
            array[i] = arrayElement;
        }
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] arrayReverse = new int[arrayLength];
        for (int j = 0; j < arrayLength; j++) {
            arrayReverse[j] = array[arrayLength - 1 - j];
        }
        for (int j = 0; j < arrayLength; j++) {
            System.out.print(arrayReverse[j] + " ");
        }
    }
}
