/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;

/**
 *
 * @author natashapiedrabuena
 */
public class Employee {
    String name;
    int idNumber;
    String department;
    String position;
    public Employee(String name,int idNumber, String department,String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    
    public Employee(String name,int idNumber){                      //no-arg constructor 
        this.name = name;
        this.idNumber = idNumber;
        department = " ";
        position = " ";
    }
    public Employee(){
        name = " ";
        idNumber = 0;
        department = " ";
        position = " ";
    }
    public void setname(String name){
        this.name= name;
    }
    public void setidNumber(int idNumber){
        this.idNumber= idNumber;
    }
    public void setdepartment(String department){
        this.department= department;
    }
    public void setposition(String position ){
        this.position = position;
    }
    public String getname(){
        return name;
    }
    public int getidNumber(){
        return idNumber;
    }
    public String getdepartment(){
        return department;
    }
    public String getposition(){
        return position;
    }
}

