package com.company.Day2;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int binNumber= scanner.nextInt();
        double decNum=0;
        int cucich=0;
        System.out.println("binNumber=" + binNumber);
for(;binNumber!=0;)
{
    int mnacord=(binNumber%10);
decNum=decNum+mnacord*Math.pow(2,cucich);
            cucich++;
            binNumber/=10;

}
int decNumber=(int) decNum;
        System.out.println("decNumber="+ decNumber);
    }
}
