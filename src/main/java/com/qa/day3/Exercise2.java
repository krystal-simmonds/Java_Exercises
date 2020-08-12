package com.qa.day3;

public class Exercise2 {
    public static void main(String[] args) {
        for(int i = 100; i <= 200; i++) {
            if(i % 2 == 0){
                System.out.print("- ");
            } else {
                System.out.print("* ");
            }
            System.out.println(i);
        }
    }

}