package Kata01.Strategy;

import Kata01.OrderItem;

public class StandardStrategy implements IStrategy {
    double itemPrice;
    int quantity;

    public StandardStrategy(OrderItem orderItem){
        this.itemPrice = orderItem.getPrice();
        this.quantity=orderItem.getQuantity();
    }

    @Override
    public Double getTotalPrice() {
        return itemPrice*quantity;
    }
}
