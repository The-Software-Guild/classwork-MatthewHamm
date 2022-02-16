package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        int userInput;
        int count=0;
        String current;
        Scanner sc =new Scanner(System.in);
        System.out.print("How many units of fizzing and buzzing do you need in your life?");
        userInput=Integer.parseInt(sc.next());
        for(int i=0;userInput>count;i++){
            current=String.valueOf(i);
            if(i==0){

            }else{
                if(i%3==0){
                    current="fizz";
                    count++;
                }
                else if(i%5==0){
                    current="buzz";
                    count++;
                }
                if(i%5==0 && i%3==0){
                    current="fizzbuzz";
                    count++;
                }
            }

            System.out.println(current);
        }
        System.out.println("Tradition");
    }
}
