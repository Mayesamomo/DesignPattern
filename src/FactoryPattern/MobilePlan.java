/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author micha
 */
public abstract class MobilePlan {
    protected double rate;
    protected double discount;
    abstract void getRate();
    abstract void getDiscount();
    
    //calculate bills
     public void calculateBill(int units){  
              System.out.println(units*rate);  
          } 
}
