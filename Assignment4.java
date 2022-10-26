/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.assignment4;

import java.util.Scanner;
/**
 *
 * @author natashapiedrabuena
 */
public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] names =new String[]{"Jane","Paul","Tian","Mahmoud","Anisha"};// array names of size 5- to index 4
        String [] grades = new String[]{"A","A-","C+","B+","B"};// array grades of size 5- to index 4//coresponding to the names array
        do{
        System.out.println("Please enter the name and I will provide you with their grade:");
        String user = input.next();// take user input and will set it to uppercase for first substrin g and the rest lower case before puting in searchGrade
        String userInput = user.substring(0, 1).toUpperCase() + user.substring(1).toLowerCase();// could have used equalsIgnoreCase(); however this is a method we use in class
        String userGrades=searchGrade(names, grades, userInput);//taking the values and putting to the method searchGrade
        if(userGrades=="blank"){// if blank will print out message in main
        System.out.println("The name you entered was not found" );
        }
        else{// will return the value collected from searchGrade method
        System.out.println("The grade is:"+ userGrades);
        }
        System.out.println("Would you like to check another grade? Enter yes/no:");//whether user would like to continue
        String continueIn = input.next();
        String continueInput= continueIn.substring(0).toLowerCase();
        if("yes".equals(continueInput)){// if yes then the loop will continue
        }
        else if("no".equals(continueInput)){// if no the program will exit
           System.exit(0);
        }
        else{ 
            System.out.println("Invalid input");// invalid input will break the loop make it false and exit// could have used the same for the no value howver want to practice the difference between System.exit(0) and break; in loops
            break;
        }
        }while(true);// will continue as long as the value is true
    }
    
    public static String searchGrade(String [] names, String[] grades, String userInput){
        String userGrades="blank";// intializing userGrades to "blank" 
        for(int i=0;i<names.length;i++){
           if(names[i].equals(userInput)){// if any element in array Names equal to user input then the userGrades will change to grades[i]//corresponding grade depending on the index of names
            userGrades = grades[i];
            return userGrades;
           }
        }
        return userGrades;// if no userInput is match to names[i] then it will return the value of "blank"-- main method will print the message of name not found
    } 
}
    

//searchGrade will not print anything ** remember does not print anything
// program should run in loop to see if they want to check grades
// main method does all the printing 
// have to find way 