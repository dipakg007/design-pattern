package com.design.factory;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheese")){
            pizza = new NYStyleCheesePizza();
        }
        return pizza;
    }
}
