package com.company.Day3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input array length");
        int arrayLength= scanner.nextInt();
        int array[]=new int[arrayLength];
        System.out.println("input array element");
        for(int i=0;i<arrayLength;i++)
        {
            int arrayElement= scanner.nextInt();
            array[i]=arrayElement;
        }
        for(int j=1;j<arrayLength;j++)
        {
            if(array[j]>array[j-1])
            {
                System.out.print(array[j] + " ");
            }
        }
    }
}
