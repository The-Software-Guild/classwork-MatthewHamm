/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.interestcaluclator;

import java.util.Scanner;

/**
 *
 * @author Matthew Hamm
 */
public class InterestCaluclator {
    public static void main(String[] args) {
        double startMoney;
        double nextMoney;
        double interest;
        String interestTime;
        int timePeriod;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("How much do you want to invest? ");
        startMoney=Double.parseDouble(sc.next());
        System.out.println("How many years are you investing? ");
        timePeriod=Integer.parseInt(sc.next());
        
        System.out.println("Quarterly, monthly, or daily interest compound periods?");
        interestTime=sc.next();
        if(interestTime.contains("quater")){
            System.out.println("What is the annual interest rate % growth? ");
            interest=Math.pow(1+(Double.parseDouble(sc.next())/400),4);
        }
        else if(interestTime.contains("month")){
            System.out.println("What is the annual interest rate % growth? ");
            interest=Math.pow(1+(Double.parseDouble(sc.next())/1200),12);
        }else if(interestTime.contains("da")){
            System.out.println("What is the annual interest rate % growth? ");
            interest=Math.pow(1+(Double.parseDouble(sc.next())/36500),365);
        }
        else{
            System.out.println("What is the annual interest rate % growth? ");
            interest=1+(Double.parseDouble(sc.next())/100);
        }

        System.out.println("");
        System.out.println("Calculating...");
        for(int i=0 ; i<timePeriod;i++){
            nextMoney=startMoney*interest;
            System.out.println("Year "+(i+1)+":");
            System.out.println("Began with $"+startMoney);
            System.out.println("Earned $"+(nextMoney-startMoney));
            System.out.println("Ended with $"+nextMoney);
            System.out.println("");
            startMoney=nextMoney;
        }
        
        
    }
}
