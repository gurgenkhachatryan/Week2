package com.company.Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int sizearray = scanner.nextInt();
        int array[] = new int[sizearray];
        System.out.println("input element");
        for (int i = 0; i < sizearray; i++) {
            int elementNumber = scanner.nextInt();
            array[i] = elementNumber;
        }
        for (int j = 0; j < sizearray; j++) {
            if (array[j] % 2 == 0) {
                System.out.print(array[j] + " ");
            }
        }
    }
}
