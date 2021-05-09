package com.company.Day5;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int[][] array = new int[number1][number2];
        int k = 1;
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                array[i][j] = k;
                System.out.print(array[i][j] + " ");
                    if (k % number2 == 0)
                    {     System.out.println();}
                                       k++;



            // System.out.println(array[i][j]);

        }


    }

}}
