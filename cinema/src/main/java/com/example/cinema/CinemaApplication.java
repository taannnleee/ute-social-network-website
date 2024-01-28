package com.example.cinema;

import com.example.cinema.StrategyDeSignPattern.Discount50Percent;
import com.example.cinema.StrategyDeSignPattern.Ticket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class, args);
        Ticket ticket = new Ticket();
        ticket.setPrice(100.0);
        ticket.setPromoteStrategy(new Discount50Percent());
        System.out.println(ticket.getPromoteStrategy().DoDiscount(ticket.getPrice()));
    }

}
