package com.company.Day1;

import java.util.Scanner;
// Fibonacci number //
public class Task12 {
    public static void main(String[] args) {
        int fibonaciFirst = 1;
        int fibonaciSecond = 1;
        int count = 2;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isFound = false;
        while((fibonaciFirst+fibonaciSecond)<=number){
            int fibonaciThree = fibonaciFirst+fibonaciSecond;
            fibonaciFirst=fibonaciSecond;
            fibonaciSecond=fibonaciThree;
            count+=1;
            if(fibonaciThree==number){
                isFound=true;
            }
        }
        if(isFound){
            System.out.println(count);
        }
        else{
            System.out.println(-1);
        }
    }
}

