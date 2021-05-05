package com.company.Day3;

import java.util.Scanner;

public class Task10 {
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
        for(int j=0;j<arrayLength/2;j++)
        {int mijankyalTiv;
            mijankyalTiv=array[j];
            array[j]=array[arrayLength-1-j];
            array[arrayLength-1-j]=mijankyalTiv;
        }
        for(int j=0;j<arrayLength;j++)
        {
            System.out.print(array[j] + " ");
        }
    }
}
