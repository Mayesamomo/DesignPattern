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
public class GetBillCommand implements ActionListenerCommand {

    private final Bill bills;

    public GetBillCommand(Bill bills) {
        this.bills = bills;
    }

    @Override
    public void execute() {
        bills.getBill();
    }

}
