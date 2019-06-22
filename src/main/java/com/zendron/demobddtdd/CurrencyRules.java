package com.zendron.demobddtdd;

public class CurrencyRules {

    private double discount = 0.21;

    public double applyDiscount(final double price) {

        return price - (price * this.discount);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
