package com.zendron.demobddtdd;

public class CurrencyRules {

    private final double DISCOUNT = 0.21;

    public double applyDiscount(final double price) {

        return price - (price * DISCOUNT);
    }


}
