package com.company.Day3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input array length");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("input element");
        for (int i = 0; i < arrayLength; i++) {
            int arrayElement = scanner.nextInt();
            array[i] = arrayElement;
        }
        for (int j = 0; j < arrayLength-1; j += 2) {

            int mijankyalTiv = array[j];
            array[j] = array[j + 1];
            array[j + 1] = mijankyalTiv;
        }
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");

        }
    }
}