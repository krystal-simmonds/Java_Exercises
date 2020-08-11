package com.qa.day3;

public class Exercise1 {
    public static void main(String[] args){
        for (int i = 100; i <= 210; i++) {
            if (i > 200) {
                break;
            }
            System.out.println(i);
        }
    }
}
