/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stock;

/**
 *
 * @author natashapiedrabuena
 */
public class Stocktest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Stock stock = new Stock("SUNW", "Sun MicroSystems Inc.");

      stock.setPreviousClosingPrice(100);



      // Set current price

      stock.setCurrentPrice(90);



      // Display stock info

      System.out.println("Previous Closing Price: " +

      stock.getPreviousClosingPrice());

      System.out.println("Current Price: " +

      stock.getCurrentPrice());

      System.out.println("Price Change: " +

      stock.getChangePercent() * 100 + "%");


    }
    
}
