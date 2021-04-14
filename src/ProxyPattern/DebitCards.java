/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyPattern;

/**
 *
 * @author micha
 */
public class DebitCards implements CardPaymentAccess{
    private final Card debitCards;

    public DebitCards(Card debitCards) {
        this.debitCards = debitCards;
    }

  
    
    @Override
    public void grantPayment() {
        System.out.println("Card details:  " + debitCards.toString());
    }
    
    
}
