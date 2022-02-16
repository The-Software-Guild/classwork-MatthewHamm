package com.sg.foundations.flowcontrol.whiles;

public class WaitAWhile {
    public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
    //it loops an addiotional time for bedtime 11
    //it would never start the loop as the conditon wouldn't be satisfied for time now 11
    //if the increment was removed it would loop for ever
}
