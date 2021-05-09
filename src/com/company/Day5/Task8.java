package com.company.Day5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b1 = scanner.nextInt();
        int q = scanner.nextInt();
        int n = scanner.nextInt();
        int bn=b1;
        for(int i=2;i<=n;i++)
     {bn=b1*q;
         b1=bn;
              }
       System.out.println("bn="+ bn);
    }
}