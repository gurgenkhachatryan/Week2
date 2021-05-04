package com.company.Day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        int bajanarar= scanner.nextInt();
        int mnacord= scanner.nextInt();
        for(int i=number1;i<=number2;i++)
        {
if((i%bajanarar)==mnacord)
    System.out.print(i + " ");
        }
    }
}
