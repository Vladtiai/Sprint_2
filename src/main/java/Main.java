
import model.*;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat (5,100);
        Apple redApple = new Apple(10, 50, Colour.COLOUR_RED);
        Apple greenApple = new Apple(8, 60, Colour.COLOUR_GREEN);

        Food[] products = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("общая сумма товаров без скидки: " + cart.totalPriceWithoutDiscount());
        System.out.println("общая сумма товаров со скидкой: " + cart.totalPriceWithDiscount());
        System.out.println("сумма всех вегетарианских продуктов без скидки: " + cart.totalPriceVegeterianWithoutDiscount());
    }
}