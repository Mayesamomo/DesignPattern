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
//abstract class for mobile plan
public abstract class MobilePlan {

    protected double rate;
    protected double discount;

    abstract void getRate();

    abstract void getDiscount();

    //calculate bills
    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
    
    //calculate discount.
    public void calcDiscount(double discPercentage,int units){
        double actualPrice =  units *rate;
        double discounted = actualPrice * discPercentage/100;
        System.out.println("Discounted price: = " + discounted);
    }
}
