package com.company;

import com.company.cards.DiscountCard;
import com.company.cards.NullCard;

public class PayDesk {


    static DiscountCard getCard(String typeOfCard) {
        return DiscountCard.init(typeOfCard);
    }

    static void getInfo(DiscountCard discountCard, double turnover, double purchaseValue) {
        System.out.println(String.format("- Purchase value: $%.2f", purchaseValue));
        System.out.println(String.format("- Discount rate: %.2f%s", discountCard.getDiscountRate(turnover), "%"));
        System.out.println(String.format("- Discount: $%.2f", discountCard.getDiscountRate(turnover) / 100 * purchaseValue));
        System.out.println(String.format("- Total: $%.2f", purchaseValue - discountCard.getDiscountRate(turnover) / 100 * purchaseValue));
    }
}
