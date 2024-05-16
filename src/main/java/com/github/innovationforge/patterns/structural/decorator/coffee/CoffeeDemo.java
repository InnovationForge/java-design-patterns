package com.github.innovationforge.patterns.structural.decorator.coffee;

public class CoffeeDemo {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println("Cost: " + espresso.getCost() + "; Description: " + espresso.getDescription());

        Coffee espressoWithMilk = new MilkDecorator(espresso);
        System.out.println("Cost: " + espressoWithMilk.getCost() + "; Description: " + espressoWithMilk.getDescription());

        Coffee espressoWithMilkAndSugar = new SugarDecorator(espressoWithMilk);
        System.out.println("Cost: " + espressoWithMilkAndSugar.getCost() + "; Description: " + espressoWithMilkAndSugar.getDescription());
    }
}
