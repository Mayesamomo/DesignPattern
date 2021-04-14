/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyPattern;

import java.util.Objects;

/**
 *
 * @author micha
 */
public class Card {

    private String name;
    private String address;
    private int cardNumber;
    private String expDate;
    private int cvc;
    private double totalAvailable;

    public Card(String name, String address, int cardNumber, String expDate, int cvc, double totalAvailable) {
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.cvc = cvc;
        this.totalAvailable = totalAvailable;
    }

    
    
    public Card() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public double getTotalAvailable() {
        return totalAvailable;
    }

    public void setTotalAvailable(double totalAvailable) {
        this.totalAvailable = totalAvailable;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.address);
        hash = 29 * hash + this.cardNumber;
        hash = 29 * hash + Objects.hashCode(this.expDate);
        hash = 29 * hash + this.cvc;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.totalAvailable) ^ (Double.doubleToLongBits(this.totalAvailable) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        if (this.cardNumber != other.cardNumber) {
            return false;
        }
        if (this.cvc != other.cvc) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalAvailable) != Double.doubleToLongBits(other.totalAvailable)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return Objects.equals(this.expDate, other.expDate);
    }
    
    

    @Override
    public String toString() {
        return "Card{" + "name=" + name + ", address=" + address + ", cardNumber=" + cardNumber + ", expDate=" + expDate + ", cvc=" + cvc + ", totalAvailable=" + totalAvailable + '}';
    }

    
    
}
