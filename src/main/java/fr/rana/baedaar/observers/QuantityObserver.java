package fr.rana.baedaar.observers;

import fr.rana.baedaar.entity.Order;

public class QuantityObserver implements OrderObserver{
    @Override
    public void update(Order order) {
        if (order.getItemCount() > 5) {
            order.setShippingCost(0);
        } else {
            order.setShippingCost(10);
        }
    }
}
