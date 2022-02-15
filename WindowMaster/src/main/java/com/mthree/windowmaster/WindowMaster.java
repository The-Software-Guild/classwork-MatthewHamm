/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthree.windowmaster;

import java.util.Scanner;

/**
 *
 * @author Matthew Hamm
 */
public class WindowMaster {
    public static void main(String[] args){
        // declare variable for height, width, prices
        float height=0;
        float width=0;
        float priceOfGlass=0;
        float priceOfTrim=0;
        int number=0;
        boolean isValid=false;
        //declare String variables to hold the user's height, prices and
        // width input
        String stringHeight="";
        String stringWidth="";
        String strPriceOfGlass="";
        String strPriceOfTrim="";
        String strNumber="";
        //decalre other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        // decalre and initalize the scanner
        Scanner myScanner = new Scanner(System.in);

        // get input from the user
        while(!isValid){
            try{
                System.out.println("Please enter window height: ");
                stringHeight = myScanner.nextLine();
                height =Float.parseFloat(stringHeight);
                if(height>0){
                    isValid=true;
                }
            }catch(NumberFormatException ex){
                System.out.println("Input is invalid");
            }
        }
        isValid=false;
        while(!isValid){
            try{
                System.out.println("Please enter window width: ");
                stringWidth =myScanner.nextLine();
                width = Float.parseFloat(stringWidth);
                if(width>0){
                    isValid=true;
                }
            }catch(NumberFormatException ex){
                System.out.println("Input is invalid");
            }
        }
        isValid=false;
        while(!isValid){
            try{
                System.out.println("Please enter glass price per square foot: ");
                strPriceOfGlass = myScanner.nextLine();
                priceOfGlass =Float.parseFloat(strPriceOfGlass);
                if(priceOfGlass>0){
                    isValid=true;
                }
            }catch(NumberFormatException ex){
                System.out.println("Input is invalid");
            }
        }
        isValid=false;
        while(!isValid){
            try{
                System.out.println("Please enter the price of trim per foot: ");
                strPriceOfTrim = myScanner.nextLine();
                priceOfTrim = Float.parseFloat(strPriceOfTrim);
                if(priceOfTrim>0){
                    isValid=true;
                }
            }catch(NumberFormatException ex){
                System.out.println("Input is invalid");
            }
        }
        isValid=false;
        while(!isValid){
            try{
                System.out.println("Please enter the number of windows: ");
                strNumber = myScanner.nextLine();
                number=Integer.parseInt(strNumber);
                if(number>0){
                    isValid=true;
                }
            }catch(NumberFormatException ex){
                System.out.println("Input is invalid");
            }
        }  


        
        //covert String values of height and width to float values 


        


        //calculate the area of window
        areaOfWindow =height*width;
        
        // calculate the perimeter of the window
        perimeterOfWindow=2*(height+width);
        
        //calculate the total cost - use a hard-coded vlaue
        // for material cost
        cost =number*((priceOfGlass*areaOfWindow)+(priceOfTrim*perimeterOfWindow));
        
         // display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Price of glass = " + strPriceOfGlass);
        System.out.println("Price of Trim = " + strPriceOfTrim);
        System.out.println("Number of Windows= " + strNumber);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);
    }
}
