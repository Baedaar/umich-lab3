package fr.rana.baedaar.observers;

import fr.rana.baedaar.entity.Order;

public class PriceObserver implements OrderObserver{
    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            order.addItem(-20, 1);
        }
    }
}
