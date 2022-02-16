/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.practiceprogramming;

import java.util.Scanner;

/**
 *
 * @author Matthew Hamm
 */
public class MiniMadLibs {
    public static void main(String[] args) {
        String noun1;
        String adjective1;
        String noun2;
        String number;
        String adjective2;
        String pluralNoun1;
        String pluralNoun2;
        String pluralNoun3;
        String presentVerb;
        String pastVerb;



        System.out.println("Let's play MAD LIBS");
        System.out.println("");
        System.out.print("I need a noun: ");
        Scanner sc =new Scanner(System.in);
        noun1=sc.next();
        System.out.print("\nNow an adjective: ");
        adjective1=sc.next();
        System.out.print("\nAnother noun: ");
        noun2=sc.next();
        System.out.print("\nAnd a number: ");
        number=sc.next();
        System.out.print("\nAnother adjective :");
        adjective2=sc.next();
        System.out.print("\nA plural noun :");
        pluralNoun1=sc.next();
        System.out.print("\nAnother one");
        pluralNoun2=sc.next();
        System.out.print("\nOne more: ");
        pluralNoun3=sc.next();
        System.out.print("\nA verb (infinitive form): ");
        presentVerb=sc.next();
        System.out.print("\nSame verb (past participle): ");
        pastVerb=sc.next();
        System.out.println("\n *** NOW LETS GET MAD (libs) ***");
        System.out.println(noun1+": the "+adjective1+" frontier. These are the voyages of the starship "+ noun2 +". Its "+number+"-year mission: to explore strange "+adjective2+" "+pluralNoun1+", to seek out "+adjective2+" "+pluralNoun2+" and "+adjective2+" "+pluralNoun3+", to boldly "+presentVerb+" where no one has "+pastVerb+" before.");
    }
}
