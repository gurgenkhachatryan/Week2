package com.company.Day3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input array length");
        int arrayLength = scanner.nextInt();
        int array[] = new int[arrayLength];
        System.out.println("input array element");
        int max=0, index=0;
        for (int i = 0; i < arrayLength; i++) {
            int arrayElement = scanner.nextInt();
            array[i] = arrayElement;
        }
        for(int j=0;j<arrayLength-1;j++)
        {
            if(max<array[j])
            {
                max=array[j];
                index=j;
            }
        }
        System.out.println("max=" + max + "   index=" + index);
    }
}
