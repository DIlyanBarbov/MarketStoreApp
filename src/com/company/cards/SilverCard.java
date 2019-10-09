package com.company.cards;

public class SilverCard extends DiscountCard {
    private final double initialRate = 2.0;
    private final double highestRate = 3.5;
    @Override
    public double getDiscountRate(double turnover) {
        if (turnover <= 300) return initialRate;
        else return highestRate;
    }
}
