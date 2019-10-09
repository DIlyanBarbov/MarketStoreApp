package com.company.cards;

public class DiscountCard {
    private double discountRate;

    public static DiscountCard init(String typeOfCard) {
        try {
            if (typeOfCard.equalsIgnoreCase("bronze")) {
                return new BronzeCard();
            } else if (typeOfCard.equalsIgnoreCase("silver")) {
                return new SilverCard();
            } else if (typeOfCard.equalsIgnoreCase("gold")) {
                return new GoldCard();
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            return new NullCard();
        }
    }

    public double getDiscountRate(double turnover) {
        return discountRate;
    }

}
