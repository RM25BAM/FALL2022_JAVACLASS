/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stock;

/**
 *
 * @author natashapiedrabuena
 */
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    public Stock(){}
    public Stock(String symbol,String name){
    }
    public Stock(String symbol,String name, double previousClosingPrice,double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
    public double getChangePercent(){
       return ((currentPrice-previousClosingPrice)/previousClosingPrice)/100;
    }
    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }
    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
}
