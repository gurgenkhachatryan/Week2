package com.company.Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("input 2 numbers");
        Scanner scanner =new Scanner(System.in);
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        for(int i=number1;i<=number2;i++)
        {
            if(i%2==0)
                System.out.print(i + " ");
        }
    }
}
