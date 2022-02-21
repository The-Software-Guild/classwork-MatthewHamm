/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.classmodeling;

/**
 *
 * @author Matthew Hamm
 */
public class House {
    private float[] position;
    private String address;
    private String postcode;
    
    public House(float[] position,String address,String postcode){
        this.position=position;
        this.address=address;
        this.postcode=postcode;
    }
    public float[] setPosition(float[] position){
        this.position=position;
        return this.position;
    }
    public float[] getPosition(){
        
        return position;
    }
    public String setAddress(String address){
        this.address=address;
        return this.address;
    }
    public String getAddress(){
        
        return address;
    }
    public String setPostcode(String postcode){
        this.postcode=postcode;
        return this.postcode;
    }
    public String getPostcode(){
        
        return address;
    }
}
