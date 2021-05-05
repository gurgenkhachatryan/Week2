package com.company.Day3;

import java.util.Scanner;

public class Task12 {
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
        int lastNumber = array[arrayLength - 1];
        for (int j = arrayLength - 1; j > 0; j--) {
            array[j] = array[j - 1];


        }
        array[0] = lastNumber;
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
