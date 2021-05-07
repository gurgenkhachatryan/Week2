package com.company.Day4;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("input matrix lentgh");
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int matrixlength= scanner.nextInt();
        int [][] matrix=new int[matrixlength][matrixlength];
        int [][] matrix1=new int[matrixlength][matrixlength];
        for(int i=0;i<matrixlength;i++)
        {
            for(int j=0;j<matrixlength;j++)
            {
                matrix[i][j]= random.nextInt(4);
            }
        }
        for(int i=0;i<matrixlength;i++)
        {
            for(int j=0;j<matrixlength;j++)
            {
                matrix1[i][j]= random.nextInt(4);
            }
        }
        for(int i=0;i<matrixlength;i++)
        {
            System.out.println();
            for(int j=0;j<matrixlength;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();

        for(int i=0;i<matrixlength;i++)
        {
            System.out.println();
            for(int j=0;j<matrixlength;j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
        }
        System.out.println();
        for (int i=0;i<matrixlength;i++)
        {
            System.out.println();
            for(int j=0;j<matrixlength;j++)
            {
                matrix[i][j]=matrix[i][j]+matrix1[i][j];

            System.out.print(matrix[i][j] + " ");
        }}

    }

}
