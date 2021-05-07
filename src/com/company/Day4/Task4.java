package com.company.Day4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input matrix length i j ");
        int matrixLengthi = scanner.nextInt();
        int matrixLengthj = scanner.nextInt();
        int[][] matrix = new int[matrixLengthi][matrixLengthj];
        int RandomNumber = random.nextInt(5);
        int index = 0;
        int sum = 0;
        for (int i = 0; i < matrixLengthi; i++) {
            for (int j = 0; j < matrixLengthj; j++) {
                RandomNumber = random.nextInt(5);
                matrix[i][j] = RandomNumber;
            }
        }
        for (int i = 0; i < matrixLengthi; i++) {
            for (int j = 0; j < matrixLengthj; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //   int masiv[]=new int[matrixLengthi];
        int max = 0;
        for (int i = 0; i < matrixLengthi; i++) {
            sum = 0;
            for (int j = 0; j < matrixLengthj; j++) {
                sum += matrix[i][j];

            }
            if (max < sum) {
                max = sum;
                index = i;
            }

        }

        System.out.println("max=" + max + "  index=" + index);

    }

}
