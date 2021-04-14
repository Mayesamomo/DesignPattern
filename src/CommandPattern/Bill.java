/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author micha
 */
public class Bill {
    public void getBill(){
        System.out.println("bill generated!");
    }
    
    public void downloadBill(){
        System.out.println("bill downloaded!");
    }
    
    public void payBill(){
        System.out.println("bill paid!");
    }
    
    public void subscribePrepaid(){
        System.out.println("subsciption successful!");
    }
}
