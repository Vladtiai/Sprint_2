package model;

public class Meat extends Food {
    public Meat(int amount, double price) {
        isVegetarian = false;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
