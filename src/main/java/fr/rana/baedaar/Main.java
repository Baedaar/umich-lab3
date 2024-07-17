package fr.rana.baedaar;

import fr.rana.baedaar.entity.Order;
import fr.rana.baedaar.observers.PriceObserver;
import fr.rana.baedaar.observers.QuantityObserver;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        order.addItem(50, 5);
        order.addItem(100, 2);

        System.out.println(order.toString());
    }
}