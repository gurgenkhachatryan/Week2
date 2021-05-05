package com.company.Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("input array length");
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int array[] = new int[sizeArray];
        System.out.println("inpiut element");

        for (int i = 0; i < sizeArray; i++) {
            int number = scanner.nextInt();
            array[i] = number;

        }

        for (int j = 0; j < sizeArray; j++) {
            if (array[j] > 0)
                System.out.print(array[j] + " ");
        }
    }
}
