package com.example.cinema.StrategyDeSignPattern;

public class Discount50Percent implements   IPromoteStrategy  {

    @Override
    public double DoDiscount(Double price) {
        return price*((double)1/2);
    }
}
