package com.company.Day4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();
        int max=0;int indexi=0;int indexj=0;int sum=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(6);
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");

            }
        }
        System.out.println();
for(int i=0;i<4;i++)
{
    for(int j=0;j<4;j++)
    {
        if(max<(matrix[i][j]))
        {

            max=matrix[i][j];
            indexi=i;
            indexj=j;
            sum=sum+matrix[i][j];
        }
        else
            if(max==matrix[i][j])
            {
sum=sum+matrix[i][j];

            }
sum+=matrix[i][j];
    }

}
        System.out.println("max=" + max +" index=" + indexi +"," + indexj + " sum=" +sum);
    }
}