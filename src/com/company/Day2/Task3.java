package com.company.Day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        if(number1>=number2)
        {
            System.out.println("input valid number");
            number1= scanner.nextInt();
            number2= scanner.nextInt();
        }
        else
        {
            for(int i=1;i<number2/2;i++)
            {
                int squarse=i*i;
                if(squarse>=number1 && squarse<=number2)
                {
                    System.out.print(squarse + " ");
                }
            }
        }
    }
}
