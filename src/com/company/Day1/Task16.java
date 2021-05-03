package com.company.Day1;

import java.util.Random;
import java.util.Scanner;
// Random number //
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        //   System.out.println("RandomNumber=" + randomNumber);
        System.out.print("InputNumber");
        int InputNumber = scanner.nextInt();
        while (InputNumber != randomNumber) {
            if (InputNumber < randomNumber) {
                System.out.println("your InputNumber < RandomNumber");
                InputNumber = scanner.nextInt();
            } else {
                System.out.println("your number > randomTiv");
                InputNumber = scanner.nextInt();
            }
        }
        System.out.println("Yes " + InputNumber + "=" + randomNumber);
    }
}
