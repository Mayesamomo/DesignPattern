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
public class PayBillsCommand implements ActionListenerCommand{
private final Bill bills;

    public PayBillsCommand(Bill bills) {
        this.bills = bills;
    }

    @Override
    public void execute() {
       bills.payBill();
    }
    
}
