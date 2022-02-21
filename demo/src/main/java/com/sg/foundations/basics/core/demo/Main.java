/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.demo;

/**
 *
 * @author Matthew Hamm
 */
public class Main {
    public static void main(String[] args) {
        Address ad1=new Address("Birmingham", "UK");
        Employee emp1 =new Employee(1001, "John", ad1);
        emp1.display();
    }
}
