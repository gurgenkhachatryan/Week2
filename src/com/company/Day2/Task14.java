package com.company.Day2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        for(int i=0;i<number;i++)
        {

            if(i%2==1)
            {
                System.out.print(" ");
            }
            for(int j=0;j<number;j++)
            {

                System.out.print("# ");

            }
            System.out.print("\n");
        }

    }
}
