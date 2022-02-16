package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        Random randomizer= new Random();
        boolean isClean=false;
        int currentChance=0;
        int count=0;
        while(count<7 && !isClean){
            System.out.println("Clean your room!! (x"+(count+1)+")");
            currentChance+=10;

            if(currentChance>randomizer.nextInt(100)){
                isClean=true;
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS");
            }
            else{
              count++;
            }
        }
        if(count>=7){
            System.out.print("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
        }
    }
}
