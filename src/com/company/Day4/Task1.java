package com.company.Day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int [][] matrix=new int[5][5];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if((i+j)==4)
matrix[i][j]=1;

            else
            { matrix[i][j]=0;}}
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
