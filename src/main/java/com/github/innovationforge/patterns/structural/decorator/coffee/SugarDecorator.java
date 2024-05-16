package com.github.innovationforge.patterns.structural.decorator.coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.25;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

}
