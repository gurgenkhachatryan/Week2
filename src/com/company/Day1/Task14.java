package com.company.Day1;

import java.util.Scanner;
                         //deposit in the bank//
public class Task14 {
    public static void main(String[] args) {
        System.out.println("input deposit");
        Scanner scanner=new Scanner(System.in);
        double deposit= scanner.nextDouble();
        System.out.println("input percent");
        double percent= scanner.nextDouble();
        System.out.println("input total");
        double total= scanner.nextDouble();
        int count=0;
        while(deposit<=total)
        {
            deposit=(deposit+(deposit*percent)/100);
            int dep=(int) deposit;
            count++;
        }
        System.out.println("count=" + count);
    }
}
