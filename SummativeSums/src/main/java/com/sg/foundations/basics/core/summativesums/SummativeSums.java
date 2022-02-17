/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.summativesums;

import java.util.Scanner;

/**
 *
 * @author Matthew Hamm
 */
public class SummativeSums {
    public static void main(String[] args) {
        
      
        System.out.println("Array 1");
        int[] array1=getArray();
        System.out.println("Array 2");
        int[] array2=getArray();
        System.out.println("Array 3");
        int[] array3=getArray();
        System.out.println("");
        
        System.out.println("Array 1 sum "+getSum(array1));
        System.out.println("Array 1 sum "+getSum(array2));
        System.out.println("Array 1 sum "+getSum(array3));
        

    }
    public static int [] getArray(){
        
        Scanner myScanner=new Scanner(System.in);
      
        
        String[] strArray=myScanner.next().replace("{", " ").replace("}", " ").replace("\n", "").split(",");
        int[] array=new int[strArray.length];
        for(int i=0; strArray.length>i;i++){
            System.out.println(strArray[i].trim());
            if(strArray[i].trim()!=""){
                array[i]=Integer.parseInt(strArray[i].trim());
            }

            
            
        }
        return array;
    }
    public static int getSum(int[] array) {
        int sum=0;
        for(int i=0; array.length>i;i++){
            sum+=array[i];
        }
        return sum;
    }
}
