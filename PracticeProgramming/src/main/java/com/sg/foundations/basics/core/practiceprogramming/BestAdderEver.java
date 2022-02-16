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
public class BestAdderEver {
    public static void main(String[] args){
        float number1;
        float number2;
        float number3;
        float result;
        
        String strNumber1;
        String strNumber2;
        String strNumber3;
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("What is your first number");
        strNumber1=sc.nextLine();
        number1=Float.parseFloat(strNumber1);
        System.out.println("What is your second number");
        strNumber2=sc.nextLine();
        number2=Float.parseFloat(strNumber2);
        System.out.println("What is your third number");
        strNumber3=sc.nextLine();
        number3=Float.parseFloat(strNumber3);
        System.out.print("Your result ");
        result=number1+number2+number3;
        System.out.print(result);
        
        
    }
}
