package service;

import model.Food;

public class ShoppingCart {

    private Food[] food;

        public ShoppingCart(Food[] products){
            food = products;
        }


    public double totalPriceWithoutDiscount (){
        double total = 0.0;

        for (int i = 0 ; i < food.length; i++) {
            Food product = food[i];
            total = total + (product.getAmount() * product.getPrice());
        }
        return total;
    }

    public double totalPriceWithDiscount (){
        double total = 0.0;

        for (int i = 0 ; i < food.length; i++) {
            Food product = food[i];
            total = total + (product.getAmount() * product.getPrice() * (1 - product.getDiscount()/100));
        }
        return total;
    }

    public double totalPriceVegeterianWithoutDiscount() {
        double total = 0.0;

        for (int i = 0; i < food.length; i++) {
            Food product = food[i];
            if (product.isVegetarian()) {  // явное сравнение
                total = total + (product.getAmount() * product.getPrice());
            }
        }

        return total;
    }
}

