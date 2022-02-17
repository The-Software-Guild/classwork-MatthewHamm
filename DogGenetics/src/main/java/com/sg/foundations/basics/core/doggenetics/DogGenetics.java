/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.doggenetics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matthew Hamm
 */
public class DogGenetics {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        String dogName;
        int percent1;
        int percent2;
        int percent3;
        int percent4;
        int percent5;
        Random randomiser=new Random();
        
        System.out.println("What is your dog's name? ");
        dogName=myScanner.next();
        System.out.println("Well then, I have this highly reliable report on "+dogName+"'s prestigious background right here.");
        
        System.out.println(dogName+" is:");
        System.out.println("");

        
        percent1=randomiser.nextInt(100);
        System.out.println(""+percent1+"% St. Bernard");
        if(100-percent1>0){
           percent2=randomiser.nextInt(100-percent1); 
           System.out.println(""+percent2+"% Chihuahua");
            if(100-percent1-percent2>0){
                percent3=randomiser.nextInt(100-percent1-percent2);
                System.out.println(""+percent3+"% Dramatic RedNosed Asian Pug");
                if(100-percent1-percent2-percent3>0){
                    percent4=randomiser.nextInt(100-percent1-percent2-percent3);
                    System.out.println(""+percent4+"% Common Cur");
                    if(100-percent1-percent2-percent3-percent4>0){
                        percent5=100-percent1-percent2-percent3-percent4;
                        System.out.println(""+percent5+"% King Doberman");
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("Wow, that's QUITE the dog!");

        
    }
}
