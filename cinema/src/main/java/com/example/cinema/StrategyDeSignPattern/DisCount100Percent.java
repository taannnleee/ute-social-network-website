package com.example.cinema.StrategyDeSignPattern;

public class DisCount100Percent implements IPromoteStrategy{

    @Override
    public double DoDiscount(Double price) {
        return 0;
    }
}
