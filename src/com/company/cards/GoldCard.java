package com.company.cards;

public class GoldCard extends DiscountCard {
    private final double initialRate = 2.0;
    private double flexRate;

    @Override
    public double getDiscountRate(double turnover) {
        if (turnover >= 100) {
            flexRate = initialRate;
            for (int i = 100; i < turnover; i += 100) {
                flexRate += 1.0;
                if (flexRate == 10.0) break;
            }
            return flexRate;
        } else return initialRate;
    }
}
