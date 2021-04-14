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
public class PrepaidPlan extends MobilePlan{

    private double prepaidRate;
    private double disc;
    
    public PrepaidPlan() {
    }

    public PrepaidPlan(double prepaidRate) {
        this.prepaidRate = prepaidRate;
    }
    
    
    @Override
    void getRate() {
       rate = this.prepaidRate;
    }

    @Override
    void getDiscount() {
        discount = this.disc;
    }
    
}
