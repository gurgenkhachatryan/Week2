package com.company.Day1;

import java.util.Scanner;

//Ascii codes from 32 to 122//
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number 32-122");
        int count = 0;
        for (char ch = 33; ch < 122; ch++) {
            count++;
            System.out.print(ch + " ");
            if (count == 10) {
                count = 0;
                System.out.println();
            }
        }
    }
}