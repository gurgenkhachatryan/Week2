package com.company.Day2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println("password=" + password);
        int passLength = password.length();
        System.out.println("pasLength=" + passLength);


        boolean a1 = false;
        boolean a2 = false;
        boolean a3 = false;
        boolean a4 = false;
        for (int i = 0; i < passLength; i++) {
            char nish = password.charAt(i);
            int intNish = (int) nish;

            // int intNish=Integer.parseInt(password);

            if (intNish >= 48 && intNish <= 57) {
                a1 = true;

            }
            if (intNish >= 65 && intNish <= 90) {
                a2 = true;
            }
            if (intNish >= 97 && intNish <= 122) {
                a3 = true;
            }
            if ((intNish == 35) || (intNish == 36) || (intNish == 64)) {
                a4 = true;
            }
        }
        if (a1 && a2 && a3 && a4)
            System.out.println("password valid");
        else {
            System.out.println("password invalid");
        }

    }
}
