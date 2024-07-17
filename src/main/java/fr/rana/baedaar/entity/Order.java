package fr.rana.baedaar.entity;

import fr.rana.baedaar.observers.OrderObserver;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private double totalPrice = 0.0;
    private int itemCount = 0;
    private double shippingCost = 10.0;

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void addItem(double price, int quantity) {
        totalPrice += price * quantity;
        itemCount += quantity;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Order(totalPrice=" + totalPrice + ", itemCount=" + itemCount + ", shippingCost=" + shippingCost + ")";
    }
}
