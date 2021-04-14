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
public class BillPayPlan extends MobilePlan {

    private double BillRate;
    private double disc;

    @Override
    void getRate() {
        rate = this.BillRate;
    }

    @Override
    void getDiscount() {
        discount =this.disc;
    }

}
