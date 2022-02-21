/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wiley.main;

/**
 *
 * @author Matthew Hamm
 */
public class Student {
    String company_name;
    public  Student(){
        System.out.println("Student class constructor");
    }
    public Student(String company_name){
        this.company_name=company_name;
        System.out.println(company_name);
    }
    public Student(String firstName, int age){
        System.out.println("My name is : "+firstName+" My age is : "+age);
    }
    public void show(){
        System.out.println(company_name);
        System.out.println("hello from show");
    }
    
}
