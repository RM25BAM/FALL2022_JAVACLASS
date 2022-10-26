package com.mycompany.assignment2;
import java.util.Scanner;

/**
 *
 * @author natashapiedrabuena
 */
public class Assignment2 {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String ops;
    do{
        System.out.println("Enter an operator (+,-,*,/),enter x to exit:");
        ops = input.next();
        switch(ops){
            case "+":
                System.out.println(" Enter two numbers:");
                String userNumbers = input.nextLine();
                int sum = userNumbers.charAt(1)+ userNumbers.charAt(2);
                System.out.println(sum);
            case "-":
                System.out.println(" Enter two numbers:");
                String userNumbers2 = input.nextLine();
                int subtract = userNumbers2.charAt(1) - userNumbers2.charAt(2);
                System.out.println(subtract);
            case "*":
                System.out.println(" Enter two numbers:");
                String userNumbers3 = input.nextLine();
                int multiply = userNumbers3.charAt(1)* userNumbers3.charAt(2);
                System.out.println(multiply);
            case "/":
                System.out.println(" Enter two numbers:");
                String userNumbers4 = input.nextLine();
                int divide = userNumbers4.charAt(1)+ userNumbers4.charAt(2);
                System.out.println(divide);
            default:
                System.out.println("The input is not valid. Please try again.");
                
        }
    }while(!"x".equals(ops));
 }
}
