/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.factorizer;

import java.util.Scanner;

/**
 *
 * @author Matthew Hamm
 */
public class Factorizer {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int input;
        int currentNo=0;
        int total=0;
        System.out.println("What number would you like to factor? ");
        input=Integer.parseInt(sc.next());
        int[] prime= new int[input];
        for(int i=1;i<input/2;i++){
            if(i==1){
                prime[currentNo]=i;
                currentNo++;
            }
            else if(input%i==0){
                prime[currentNo]=i;
                currentNo++;
                prime[currentNo]=input/i;
                currentNo++;
            }
        }
        int[] shrinkPrime=ShrinkArray(prime);
        System.out.println("\nThe factors of "+input+" are:");
        for(int j=0;j<shrinkPrime.length;j++){
            System.out.print(shrinkPrime[j]+" ");
            total+=shrinkPrime[j];
        }
        System.out.println("\n"+input+" has "+ shrinkPrime.length+ "factors.");
        if(total==input){
            System.out.println(input+" is a perfect number. ");
        }
        else{
            System.out.println(input+" isn't a perfect number. ");
        }
        if(shrinkPrime.length==1){
            System.out.println(input+" is a prime number. ");
        }else{
            System.out.println(input+" isn't a prime number. ");
        }
        
    }
    public static int[] ShrinkArray(int[] original){
        int noZero=0;
        

        for (int i = original.length-1; i >=0; i--)
        {
            
            if(original[i]!=0){
                break;
            }
            else{
                noZero++;
            }
            
        }
        int[] newArray = new int[original.length - noZero];
        for(int j=0;j<original.length - noZero;j++){
            newArray[j]=original[j];
        }

        return newArray;
    }
}
