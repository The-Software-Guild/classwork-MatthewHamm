/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wiley.main.shopasignment;

import com.wiley.models.shopasignment.Product;
import com.wiley.service.shopasignment.Customer;
import java.util.Scanner;



/**
 *
 * @author Matthew Hamm
 */
public class Main {
    public static void main(String[] args) {
        //ask for a customer name an id and creates a customer
        Customer currCustomer=askForCustomer();
        //displays products and sets customers cart after getting an input
        currCustomer.setCartArray(askForOrder(currCustomer));
        //displays currCustomers cart
        displayOrder(currCustomer);
        //asks if you wan to restart
        askForNextCustomer();
        
        
    }
    public static Customer askForCustomer() {
        //declares variables
        Scanner myScanner=new Scanner(System.in);
        String name;
        long id;
        
        //asks fo name and id
        System.out.println("What is your name? ");
        name=myScanner.nextLine();
        System.out.println("What is your id? ");
        id=Long.parseLong(myScanner.nextLine());
        return new Customer(id, name);
    }
    public static Product[] askForOrder(Customer customer) {
        //declares varibles
        String[] idArray;
        Scanner myScanner=new Scanner(System.in);
        
        //loops through products and prints them out
        for(Product item: customer.getProductArray()){
            System.out.println(item.getProductId()+" "+item.getProductName()+" £"
                                +item.getProductPrice());
            
        }
        //asks for order
        System.out.println("What products do you want to buy?(Ask as a comma sperated list of ids)");
        //takes input as an array
        idArray=myScanner.next().split(",");
        Product[] inputCartArray=new Product[idArray.length];
        //loops through order ad gets correct products
        for(int i=0;i<idArray.length;i++){
            if(0>Integer.parseInt(idArray[i].trim())||
                Integer.parseInt(idArray[i].trim())>customer.getProductArray().length){
                System.out.println("This value is not in product range");
                
            }
            else{
                
                inputCartArray[i]=getProductFromId(Long.parseLong(idArray[i].trim()),customer.getProductArray());
            }

        }
        return inputCartArray;
    }
    public static void displayOrder(Customer customer) {
        double total=0;
        System.out.println("");
        System.out.println("Your order");
        //displayes
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

