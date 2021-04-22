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
public class ProxyCardAccess implements CardPaymentAccess {

    private Card debitCards;
    private final DebitCards debits;

    public ProxyCardAccess(DebitCards debits) {
        this.debits = debits;
    }

    @Override
    public void grantPayment() {
       
    }

    public double getAvailable(Card cardDeatails) {
       
      return debitCards.getCardNumber();
    }
}
