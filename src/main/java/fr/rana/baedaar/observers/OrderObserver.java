package fr.rana.baedaar.observers;

import fr.rana.baedaar.entity.Order;

public interface OrderObserver {
    void update(Order order);
}
