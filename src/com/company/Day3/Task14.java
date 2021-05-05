package com.company.Day3;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input array length");
        int arrayLength= scanner.nextInt();
        int [] array=new int[arrayLength];
        System.out.println("input array element");
        for(int i=0;i<arrayLength;i++)
        {
            int arrayElement= scanner.nextInt();
            array[i]=arrayElement;
        }
        System.out.println("input index");
        int index= scanner.nextInt();
        for(int j=index;j<arrayLength-1;j++)
        {
         //   int a=array[index];
            array[j]=array[j+1];
        }
        for(int i=0;i<arrayLength-1;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
