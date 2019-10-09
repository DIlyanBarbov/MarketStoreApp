package com.company;

import com.company.cards.DiscountCard;
import com.company.cards.NullCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarketStore {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        DiscountCard discountCard;
        String line = "";
        while (true) {
            do {
                System.out.println("Enter the type of card you want to use: [bronze, silver, gold or x to exit the program]");
                line = bufferedReader.readLine();
                if (line.equalsIgnoreCase("x")) return;
                discountCard = PayDesk.getCard(line);
                if (discountCard instanceof NullCard || discountCard == null) {
                    System.out.println("This type of card is not available...");
                    System.out.println("Please enter a valid type of card...");
                }
            } while (discountCard instanceof NullCard || discountCard == null);
            double turnover;
            do {
                System.out.println("Enter the turnover: ");
                turnover = Double.parseDouble(bufferedReader.readLine());
                if (turnover < 0) System.out.println("Turnover can't be negative...");
            } while (turnover < 0);
            double purchaseValue;
            do {
                System.out.println("Enter the purchase value: ");
                purchaseValue = Double.parseDouble(bufferedReader.readLine());
                if (purchaseValue < 0) System.out.println("Purchase value can't be negative...");
            } while (purchaseValue < 0);
            PayDesk.getInfo(discountCard, turnover, purchaseValue);
        }
    }
}
