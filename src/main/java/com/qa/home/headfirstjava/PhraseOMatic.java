package com.qa.home.headfirstjava;

public class PhraseOMatic {

    public static void main(String[] args) {
        //create three word sets
        String[] wordListOne = {"smart", "24/7", "Solid", "win-win"};
        String[] wordListTwo = {"outside-the-box", "branded", "focused", "empowered"};
        String[] wordListThree = {"game changer", "space", "vision", "mission"};

        //find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generate 3 random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //print out phrase
        System.out.println("What we need is a " + phrase);

    }
}
