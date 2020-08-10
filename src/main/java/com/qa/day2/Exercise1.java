package com.qa.day2;

public class Exercise1 {
    public static void main(String[] args) {
        addIntegers(4, 3);
        multiplyIntegers(4, 3);
        subtractIntegers(4, 3);
        divideIntegers(4, 12);
    }
    public static int addIntegers (int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
        return result;
    }

    public static int multiplyIntegers (int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
        return result;
    }

    public static int subtractIntegers (int num1, int num2) {
        int result = num1 - num2;
        System.out.println(result);
        return result;
    }

    public static double divideIntegers (double num1, double num2) {
        double result = 0;
        if(num1 >= num2) {
            result = num1 / num2;
            System.out.println(result);
        } else {
            System.out.println("The division cannot be performed");
        }
        return result;
    }
}
