/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.demo;

/**
 *
 * @author Matthew Hamm
 */
public class Employee {
    int empId;
    String name;
    Address address;
    public  Employee(int empId,String name,Address address){
        this.empId=empId;
        this.name=name;
        this.address=address;
        
    }
    public  void display(){
        System.out.println(this.empId+" "+this.name);
        System.out.println(this.address.city+" "+this.address.country);
    }
}
