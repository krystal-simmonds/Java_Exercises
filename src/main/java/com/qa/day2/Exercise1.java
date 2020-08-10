package com.qa.day2;

public class Exercise1 {
    public static void main(String[] args) {
        addIntegers(4, 3);
        multiplyIntegers(4, 3);
        subtractIntegers(4, 3);
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
}
