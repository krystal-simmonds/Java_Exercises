package com.qa.day4;

import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        Scanner ssc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = ssc.nextInt();
        int m = n;
        for (int x = 2; m != x; x++) {
            m = m / x;
        }
        System.out.println("The reverse factorial of " + n + " is " + m);
    }

}
