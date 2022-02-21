/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.encapsulation;

/**
 *
 * @author Matthew Hamm
 */
public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setEmpId(1);
        emp.setFullName("John Smith");
        emp.setSalary(10000);
        
        System.out.println(emp.getEmpId());
        System.out.println(emp.getFullName());
        System.out.println(emp.getSalary());
    }
}
