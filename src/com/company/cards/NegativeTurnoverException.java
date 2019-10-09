package com.company.cards;

public class NegativeTurnoverException extends Exception {
    @Override
    public String toString() {
        return "Turnover can't be negative, assuming lowest or initial rate...";
    }
}
