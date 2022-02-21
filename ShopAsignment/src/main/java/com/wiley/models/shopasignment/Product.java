/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wiley.models.shopasignment;

/**
 *
 * @author Matthew Hamm
 */
public class Product {
    private long productId;
    private String productName;
    private double productPrice;
    public Product(long productId,String productName,double productPrice){
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }

    public Product() {
    }

    public long getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getProductPrice() {
        return productPrice;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    
    
    
    

}
