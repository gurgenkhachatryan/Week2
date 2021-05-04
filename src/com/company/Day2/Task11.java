package com.company.Day2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumber = scanner.nextInt();
        System.out.println("input " + countNumber + " numbers ");
        int countZero = 0;
        int countMinus = 0;
        int countPlus = 0;
        for (int i = 1; i <= countNumber; i++) {

            int number = scanner.nextInt();
            if (number == 0) {
                countZero++;
            } else if (number < 0) {
                countMinus++;
            } else
                countPlus++;
        }
        System.out.println("countZero=" + countZero + "  countPlus=" + countPlus + "   countMinus=" + countMinus);
    }
}
