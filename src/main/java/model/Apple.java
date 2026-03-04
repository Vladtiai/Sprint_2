package model;

import model.constants.Colour;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, String colour) {
        isVegetarian = true;
        this.amount = amount;
        this.price = price;
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (this.colour == Colour.colourRed){
            return 60;
        }
        else {
            return 0;
        }

    }
}