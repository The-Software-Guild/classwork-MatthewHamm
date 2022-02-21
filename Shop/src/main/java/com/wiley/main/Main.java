/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wiley.main;

import com.wiley.service.Customer;
import com.wliey.models.Product;
import java.util.Scanner;

/**
 *
 * @author Matthew Hamm
 */
public class Main {
    public static void main(String[] args) {

        Customer currCustomer=askForCustomer();
 
        currCustomer.setCartArray(askForOrder(currCustomer));
        displayOrder(currCustomer);
  
        askForNextCustomer();
        
        
    }
    public static Customer askForCustomer() {
        Scanner myScanner=new Scanner(System.in);
        String name;
        long id;
        System.out.println("What is your name? ");
        name=myScanner.nextLine();
        System.out.println("What is your id? ");
        id=Long.parseLong(myScanner.nextLine());
        return new Customer(id, name);
    }
    public static Product[] askForOrder(Customer customer) {
        String[] idArray;
        Scanner myScanner=new Scanner(System.in);  
        for(Product item: customer.getProductArray()){
            System.out.println(item.getProductId()+" "+item.getProductName()+" £"
                                +item.getProductPrice());
            
        }
        System.out.println("What products do you want to buy?(Ask as a comma sperated list of ids)");
        idArray=myScanner.next().split(",");
        Product[] cartArray=new Product[idArray.length];
        for(int i=0;i<idArray.length;i++){
            if(0>Integer.parseInt(idArray[i].trim())||
                Integer.parseInt(idArray[i].trim())>customer.getProductArray().length){
                System.out.println("This value is not in product range");
                
            }
            else{
                
                cartArray[i]=getProductFromId(Long.parseLong(idArray[i].trim()),customer.getProductArray());
            }

        }
        return cartArray;
    }
    public static void displayOrder(Customer customer) {
        long total=0;
        System.out.println("");
        System.out.println("Your order");
        for(Product item:customer.getCartArray()){
            total+=item.getProductPrice();
            System.out.println(item.getProductId()+" "+item.getProductName()+" £"
                                 +item.getProductPrice());
        }

        System.out.println("The total cost is :£"+total);
    }
    public static void askForNextCustomer() {
        Scanner myScanner=new Scanner(System.in); 
        String choice;
        String[] args=new String[1];
        System.out.println("Thanks for shopping");
        System.out.println("Do you have another customer? (y/n)");
        choice=myScanner.nextLine();
        if(choice.contains("y")){
            main(args);
        }
    }
    public static Product getProductFromId(long id, Product[] productArray){
        for(Product item:productArray){
            if(item.getProductId()==id){
                return item;
            }
        }
        return new Product();
    }
    
}
