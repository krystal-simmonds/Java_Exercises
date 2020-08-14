package com.qa.home.headfirstjava;

public class beerbottles {
    
    public static void main(String[] args) {
        int beerNum = 99;
        String words = "bottles";
        
        while (beerNum > 0) {
            
            if (beerNum == 1) {
                
                words = "bottle";
                
            }
            System.out.println(beerNum + " " + words + " of beer on the wall");
            System.out.println(beerNum + " " + words + " of beer");
            System.out.println("Take one down, pass it around");
            beerNum = beerNum - 1;
            
            if (beerNum > 0) {
                System.out.println(beerNum + " " + words + " of beer on the wall.");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
            
        }
    }
    
}
