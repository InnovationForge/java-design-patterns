package com.github.innovationforge.patterns.structural.decorator.coffee;

public class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
