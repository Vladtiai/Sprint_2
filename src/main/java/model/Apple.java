package model;

import model.constants.Colour;
import model.constants.Discount;

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
        if (Colour.COLOUR_RED.equals(this.colour)){
            return Discount.RED_APPLE_DISCOUNT;
        }
        else {
            return 0;
        }

    }
}