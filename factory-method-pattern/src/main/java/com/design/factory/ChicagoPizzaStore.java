package com.design.factory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
