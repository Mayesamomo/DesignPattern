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
public class MobilePlanFactory {
    
    //getplan method retrieves obj of mobile plan type
    
    public MobilePlan getPlanType(String planType){
        //if no plan is selected
        if(planType ==null){
            return null;
        }
        // if a certain type of plan is selected
        if(planType.equalsIgnoreCase("PREPAID")){
            return new PrepaidPlan();
        }
        else if(planType.equalsIgnoreCase("BILLPAY")){
            return new BillPayPlan();
        }
        return null;
    }
}
