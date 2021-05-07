package com.company.Day5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char arajintar = text.charAt(0);
        int intotext = (int) arajintar;

        if (intotext >= 97 && intotext <= 122) {
            intotext = intotext - 32;
        }
        char revotext = (char) intotext;
        System.out.print(revotext);
        //  System.out.println("revotext=" + revotext);
char revttext;
        for (int i = 1; i < text.length(); i++) {

            char ttext = text.charAt(i);
            int intttext = (int) ttext;
            if (intttext >= 65 && intttext <= 90) {
                intttext += 32;
            }
             revttext = (char) intttext;
            System.out.print(revttext);
        }

    }
}