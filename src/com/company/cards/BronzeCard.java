package com.company.cards;

public class BronzeCard extends DiscountCard {
    private final double lowestRate = 0.0;
    private final double midRate = 1.0;
    private final double highestRate = 2.5;

    @Override
    public double getDiscountRate(double turnover) {
            if (turnover < 100) return lowestRate;
            else if (turnover <= 300) return midRate;
            else return highestRate;
    }
}
