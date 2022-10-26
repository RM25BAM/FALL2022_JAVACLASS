/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.homework5;

/**
 *
 * @author natashapiedrabuena
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee Employee1 = new Employee("Susan Meyers", 47899, "Accounting","Vice Presidents");
        Employee Employee2 = new Employee("Mark Jones", 39119, "IT", "Programming");
        Employee Employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        Employee Employees[] = {Employee1,Employee2, Employee3};
        for(int i = 0; i<Employees.length;i++){
            System.out.printf("Employee # %d \n",(i+1));
            System.out.printf("Name: %s \n", Employees[i].getname());
            System.out.printf("ID Number: %d \n", Employees[i].getidNumber());
            System.out.printf("Department: %s \n",Employees[i].getdepartment());
            System.out.printf("Position: %s \n",Employees[i].getposition());
            System.out.println(" ");
        }
    }
    
}
