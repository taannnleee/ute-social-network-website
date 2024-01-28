package com.example.cinema.StrategyDeSignPattern;

public class Ticket {
    private IPromoteStrategy promoteStrategy;
    private Double price;

    public IPromoteStrategy getPromoteStrategy() {
        return promoteStrategy;
    }

    public Double getPrice() {
        return price;
    }

    public void setPromoteStrategy(IPromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Ticket(){}
    public Ticket(IPromoteStrategy PromoteStrategy){
        this.promoteStrategy = PromoteStrategy;
    }

    public double GetPromotedPrice(){
        return promoteStrategy.DoDiscount(price);
    }
}
