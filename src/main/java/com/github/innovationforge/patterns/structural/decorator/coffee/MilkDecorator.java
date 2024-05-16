package com.github.innovationforge.patterns.structural.decorator.coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.50;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
}