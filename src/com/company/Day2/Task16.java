package com.company.Day2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
        }
        System.out.println();
        for (int k = number; k >= 0; k--) {
            System.out.println();
            for (int l = 1; l <= k; l++) {
                System.out.print(" * ");
            }
        }
        System.out.println();


        for(int i=number;i>0;i--)
        {
            String secondRow="";
            for(int j=0;j<(number-i);j++)
            {
                secondRow+=" ";
            }
            for(int k = 0;k<i;k++){
                secondRow+="*";
            }
            System.out.print(secondRow+"\n");
        }

        System.out.println();

        for(int i = 1;i<=number;i++){
            String currentRow = "";
            for(int j=0;j<(number-i);j++){
                currentRow+=" ";
            }
            for(int k=0;k<i;k++){
                currentRow+="*";
            }
            System.out.print(currentRow+"\n");
        }


    }}