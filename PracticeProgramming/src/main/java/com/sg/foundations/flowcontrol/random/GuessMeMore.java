/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matthew Hamm
 */
public class GuessMeMore {
    public static void main(String[] args){
        int guessNumber=-200;
        int randNumber;

        Scanner sc=new Scanner(System.in);
        
        Random randomizer = new Random();
        
        randNumber=randomizer.nextInt(200)-100;
        
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        while(guessNumber!=randNumber){
            System.out.print("Your guess: ");
            guessNumber=Integer.parseInt(sc.next());
            if(guessNumber<randNumber){
                System.out.println("Ha, nice try - too low! Try again!");
            }else if(guessNumber>randNumber){
                System.out.println("Ha, nice try - too high! Try again!");
            }else{
                System.out.println("Wow, nice guess! That was it!");
            }
        }

    }
}
