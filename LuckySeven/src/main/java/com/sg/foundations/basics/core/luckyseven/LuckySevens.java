/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.luckyseven;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matthew Hamm
 */
public class LuckySevens {
    public static void main(String[] args) {
        Random randomiser=new Random();
        int startMoney;
        int currMoney;
        int highMoney;
        int highRolls=0;
        int currRolls=0;
        int dice1;
        int dice2;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many dollars do you have? ");
        startMoney=Integer.parseInt(sc.next());
        currMoney=startMoney;
        highMoney=currMoney;
        while(currMoney>0){
            //System.out.println(currMoney);
            currRolls++;
            dice1=randomiser.nextInt(6)+1;
            dice2=randomiser.nextInt(6)+1;
            if(dice1+dice2==7){
                currMoney+=4;
            }
            else{
                currMoney-=1;
            }
            
            if(currMoney>highMoney){
                highMoney=currMoney;
                highRolls=currRolls;
            }
        }
        System.out.println("You are broke after "+currRolls+" rolls.");
        System.out.println("You should have quit after "+highRolls+" rolls when you had "+highMoney+".");
        
    }
}
