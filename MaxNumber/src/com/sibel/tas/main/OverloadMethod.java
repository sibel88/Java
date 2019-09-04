package com.sibel.tas.main;

public class OverloadMethod {
    public static void main(String[] args) {
        System.out.println(calculateCost(5.5, 1.1));

    }

    public static double calculateCost(double price, double tax) {
        double cost;
        cost = (price + tax) * 1.1;
        return cost;

    }

    public static double calculateCost(double price, double tax, double shipping) {
        double cost;
        cost = (price + tax + shipping) * 1.1;

        return cost;

    }
}
