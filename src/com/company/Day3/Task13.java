package com.company.Day3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input array length");
        int arrayLength = scanner.nextInt();
        System.out.println("input array element");
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int arrayElement = scanner.nextInt();
            array[i] = arrayElement;
        }
        int max = 0;
        int index = 0;
        for (int j = 0; j < arrayLength; j++) {

            if (max < array[j]) {
                max = array[j];
                index = j;
            }

        }
        System.out.println("max=" + max + " index=" + index);
        int min = max;
        int minIndex = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("min=" + min + " minindex=" + minIndex);
        array[minIndex] = max;
        array[index] = min;
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
