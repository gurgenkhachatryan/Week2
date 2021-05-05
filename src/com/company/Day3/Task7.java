package com.company.Day3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input array length");
        int arrayLength= scanner.nextInt();
        int array[]=new int[arrayLength];
        System.out.println("input array element");
        int min=1000;
        for(int i=0;i<arrayLength;i++)
        {
            int arrayElement= scanner.nextInt();
            if(arrayElement>1000)
            {
                System.out.println("input valid element");
                break;
            }

            array[i]=arrayElement;
        }
        for(int j=0;j<arrayLength;j++)
        {
            if(min>array[j])
            {
                min=array[j];
            }

        }

        System.out.println("min=" + min);
    }

}
