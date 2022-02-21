/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wiley.service;

import com.wliey.models.Product;

/**
 *
 * @author Matthew Hamm
 */
public class Customer {
    private long customerId;
    private String customerName;
    private Product[] cartArray;
    private Product[] productArray={new Product(0,"Macbook",2000),new Product(1,"PS5",500)
                                , new Product(2,"Switch",200),new Product(3,"Iphone",500),new Product(4,"Samsung",400)};

    public Customer(long customerId,String customerName) {
        this.customerId=customerId;
        this.customerName=customerName;
        System.out.println("Hello, "+customerName);
    }
    public long getCustomerId(){
        return customerId;
    }
    public void setCustomerId(long customerId){
        this.customerId=customerId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public Product[] getCartArray(){
        return cartArray;
    }
    public void setCartArray(Product[] cartArray){
        this.cartArray=cartArray;
    }

    public Product[] getProductArray() {
        return productArray;
    }

    public void setProductArray(Product[] productArray) {
        this.productArray = productArray;
    }
    
}
