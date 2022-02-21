/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.encapsulation;

/**
 *
 * @author Matthew Hamm
 */

public class Employee {
    private int empId;
    private String fullName;
    private long salary;
    public Employee(){
    
    }
    public Employee(int empId,String fullName,long salary){
        this.empId=empId;
        this.fullName=fullName;
        this.salary=salary;
    }
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public int getEmpId(){
        return  empId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }
    
    
}
