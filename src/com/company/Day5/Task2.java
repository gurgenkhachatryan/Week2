package com.company.Day5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minuteNumber = scanner.nextInt();
        int minute = 0;
        int jam = 0;
        if (minuteNumber > 1440) {
            minuteNumber = minuteNumber % 1440;
        }
        if (minuteNumber < 1440) {
            minute = minuteNumber % 60;
            jam = minuteNumber / 60;
        }
        System.out.println("Jam=" + jam + " minute=" + minute);
    }
}
