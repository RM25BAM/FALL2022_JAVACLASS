/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojectwithoutclasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author natashapiedrabuena
 */
public class finalProjectJava {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        do{
        System.out.println("----------MENU----------");
        System.out.println("1. Get instructor information \n2. Insert a new instructor \n3. Insert a new department \n4. Exit \n5. Get department information \n");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
            switch(userInput){
                case 1:
                    findInstructor();
                    break;
                case 2:
                    addNewInstructor();
                    break;
                case 3:
                    addNewDepartmentToFile();
                    break;
                case 4:
                     System.exit(0);
                case 5:
                    getDepartmentInfo();
            }
        }while(true);
    }
    public static void findInstructor() throws FileNotFoundException{
        System.out.println("Enter the instructor id:");
        Scanner input = new Scanner(System.in);
        int IDnumber = input.nextInt();
        getInfoInstructor(IDnumber);
        
    }
    public static void addNewInstructor() throws FileNotFoundException, IOException{
        Scanner input = new Scanner(System.in);
        boolean numberIDexist,departmentExist;
        System.out.println("Enter the instructor id:");
        int instructorID = Integer.parseInt(input.nextLine());
        numberIDexist=readInstructorFile(instructorID);
        if(numberIDexist == true){
        do{
            System.out.println("The instructor id is already present");
            System.out.println("Enter the instructor id:");
            instructorID = Integer.parseInt(input.nextLine());
            numberIDexist=readInstructorFile(instructorID);
        }while(numberIDexist==true);
        }
        System.out.println("Enter the instructor name:");
        String name = input.nextLine();
        System.out.println("Enter the affiliated department name:");
        String departmentName = input.nextLine().toUpperCase();
        departmentExist=readDepartmentFile(departmentName,0);
        if(departmentExist == false){
             do{
            System.out.println("The department does not exist");
            System.out.println("Enter the affiliated department name:");
            departmentName = input.nextLine().toUpperCase();
            departmentExist=readDepartmentFile(departmentName,0);
        }while(departmentExist==false);
        }
        appendingInstructorFile(instructorID,name,departmentName);
        
    }
    public static void getInfoInstructor(int IDnumber) throws FileNotFoundException{
    java.io.File file = new java.io.File("/Users/natashapiedrabuena/Desktop/instructor.txt");
    Scanner input = new Scanner(file);
     String [] info;
     boolean works=true;
      while(input.hasNextLine()){
        String line = input.nextLine();
        info = line.split(",");
        int id = Integer.parseInt(info[0]);
        if(id==IDnumber){
        String name = info[1];
        String department = info[2];
        getInfoDepartment(name,department);
        break;
        }
        else if(input.hasNextLine()==false && id!=IDnumber){
             works= false;
        }
    }
      if(works == false){
          System.out.println("The ID does not appear in the file.");
             findInstructor();
      }
      input.close();
    }
    public static void  getInfoDepartment(String name,String department) throws FileNotFoundException{
     java.io.File file = new java.io.File("/Users/natashapiedrabuena/Desktop/department.txt");
    // Create a Scanner for the file
    Scanner input = new Scanner(file);
     // Read data from a file
     String [] info;
      while(input.hasNextLine()){
      String line = input.nextLine();
      info = line.split(",");
      String department2 = info[0];
      String location = info[1];
      int budget = Integer.parseInt(info[2]);
      if(department2.equals(department)){
      input.close();
      printOptionOne(name,department,location);
      break;
      }
      }
    
    input.close();
}
    public static void  printOptionOne(String name, String department, String location){   
    System.out.println("Name: " + name);
    System.out.println("Department: " + department);
    System.out.println("Location: " + location);
    }
    public static boolean readInstructorFile(int IDnumber) throws FileNotFoundException{
        java.io.File file = new java.io.File("/Users/natashapiedrabuena/Desktop/instructor.txt");
    // Create a Scanner for the file
    Scanner input = new Scanner(file);
     String [] info;
     boolean works=false;
      while(input.hasNextLine()){
        String line = input.nextLine();
        info = line.split(",");
        int id = Integer.parseInt(info[0]);
        String name = info[1];
        String department = info[2];
        if(IDnumber==id){
            works= true;
            break;
        }
        }
        input.close();
        return works;
        }
    
    
    public static boolean readDepartmentFile(String departmentExist,int option) throws FileNotFoundException{
        java.io.File file = new java.io.File("/Users/natashapiedrabuena/Desktop/department.txt");
        Scanner input = new Scanner(file);
        String [] info;
        boolean departmentExistMain=false;
        while(input.hasNextLine()){
        String line = input.nextLine();
        info = line.split(",");
        String department = info[0];
        String location = info[1];
        int budget = Integer.parseInt(info[2]);
        if(department.equalsIgnoreCase(departmentExist)&& option==1){
           System.out.println("Location:"+location);
           System.out.println("Budget:"+budget);
           departmentExistMain =true;
           break;
        }
        if(department.equalsIgnoreCase(departmentExist)&& option==0){
           departmentExistMain = true;
           break;
        }
        }
        input.close();
        return departmentExistMain;   
    }
    public static void appendingInstructorFile(int newInstructorID,String name,String departmentName) throws IOException{
    
    File file = new File("/Users/natashapiedrabuena/Desktop/instructor.txt");    
    FileWriter fw = new FileWriter(file, true); //true indicates append mode
    PrintWriter output = new PrintWriter(fw);
    output.print("\n"+newInstructorID+",");
    output.print(name +",");
    output.print(departmentName);
    output.close(); 
    System.out.println("The instructor information has been added to the instructor file.\n");
}
    public static void addNewDepartmentToFile() throws FileNotFoundException, IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the department name:");//must be 4 char
        String departmentName = input.nextLine().toUpperCase();
        boolean departmentExist;
        departmentExist = readDepartmentFile(departmentName,0);
        if(departmentExist== true){
            do{
            System.out.println("The department already exist");
            System.out.println("Enter the department name:");//must be 4 char
            departmentName = input.nextLine().toUpperCase();
            departmentExist = readDepartmentFile(departmentName,0);
            }while(departmentExist==true);
        }
        if(departmentName.length()!=4){
            do{
               System.out.println("The department name should be 4 letters"); 
                System.out.println("Enter the department name:");//must be 4 char
                departmentName = input.nextLine().toUpperCase();
                departmentExist = readDepartmentFile(departmentName,0);
            }while(departmentName.length()!=4&&departmentExist==true);
        }
        System.out.println("Enter the location:");// must be 3 char
        String location = input.nextLine().toUpperCase();
        if(location.length()!=3){
            do{
                System.out.println("The location name should be 3 letters.\n");
                System.out.println("Enter the location:");// must be 3 char
                location = input.nextLine().toUpperCase();  
            }while(location.length()!=3);
        }
        System.out.println("Enter the budget:");
        int budget = input.nextInt();
        if(budget<=0||budget>100000){
            do{
                System.out.println("The budget should be greater than 0 but less than or equal to $100,000.\n");
                System.out.println("Enter the budget:");
                budget = input.nextInt();
            }while(budget<=0||budget>100000);
            appendingDepartmentFile(departmentName,location,budget);
        }
        else{
            appendingDepartmentFile(departmentName,location,budget);
        }
        
// greater than > 0and less than or equal to  <= 100,000
    }
    public static void appendingDepartmentFile(String departmentName,String location,int budget) throws IOException{
    
    File file = new File("/Users/natashapiedrabuena/Desktop/department.txt");    
    FileWriter fw = new FileWriter(file, true); //true indicates append mode
    PrintWriter output = new PrintWriter(fw);
    output.print("\n"+departmentName+",");
    output.print(location +",");
    output.print(budget);
    output.close(); 
    System.out.println("The department information has been added to the department file.\n");
    //WORKS PERFECTLY
    
}
    public static void getDepartmentInfo() throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the department name:");
        String departmentName = input.nextLine().toUpperCase();
        Boolean departmentExist,instructorExist; 
        int option = 1;
        departmentExist = readDepartmentFile(departmentName,option);
        if(departmentExist == false){
             do{
            System.out.println("The department does not exist");
            System.out.println("Enter the affiliated department name:");
            departmentName = input.nextLine().toUpperCase();
            departmentExist=readDepartmentFile(departmentName,0);
        }while(departmentExist==false);
        }
        instructorInFile(departmentName);
       
        
    }
    public static void printDepartmentIns(String name){
        if(name.isEmpty()){
          System.out.print(" ");
        }
        else{
            System.out.println(name);
        }
        
    }

public static void instructorInFile(String departmentName) throws FileNotFoundException{
        java.io.File file = new java.io.File("/Users/natashapiedrabuena/Desktop/instructor.txt");
    // Create a Scanner for the file
    Scanner input = new Scanner(file);
     // Read data from a file
     String [] info;
     ArrayList<String> names = new ArrayList<String>();
     
      while(input.hasNextLine()){
        String line = input.nextLine();
        info = line.split(",");
        String name = info[1];
        String department = info[2];
        if(department.equals(departmentName)){
            if(!name.isEmpty()){
               names.add(name);
            }
        }
      }
      String commaseparatedlist = names.toString();
        commaseparatedlist
            = commaseparatedlist.replace("[", "")
                  .replace("]", "")
                  .replace(", ","\n");
        if(!names.isEmpty()){
             System.out.println("Instructors:");
             System.out.println(commaseparatedlist);
        }
        input.close(); 
        }
}
