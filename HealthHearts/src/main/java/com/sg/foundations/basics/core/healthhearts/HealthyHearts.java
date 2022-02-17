/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.healthhearts;

import java.util.Scanner;

/**
 *
 * @author Matthew Hamm
 */
public class HealthyHearts {
    public static void main(String[] args) {
        int age;
        Scanner myScanner=new Scanner(System.in);
        
        System.out.println("What is your age? ");
        age=Integer.parseInt(myScanner.nextLine());
        System.out.println("Your maximum heart rate should be "+(220-age)+" beats per minute");
        System.out.println("Your target HR Zone is "+((220-age)*0.5)+" - "+((220-age)*0.85)+" beats per minute");
    }
}
