package Kata01.Strategy;

import Kata01.OrderItem;

public class StandardStrategy implements IStrategy {
    double itemPrice;
    int payedQuantity;
    int orderedQuantity;

    public StandardStrategy(OrderItem orderItem){
        this.itemPrice = orderItem.getPrice();
        this.orderedQuantity=orderItem.getQuantity();
    }

    @Override
    public double getTotalPrice() {
        payedQuantity=orderedQuantity;
        return itemPrice*payedQuantity;
    }

    @Override
    public int getPayedQuantity() {
        return this.payedQuantity;
    }

    @Override
    public int getOrderedQuantity() {
        return this.orderedQuantity;
    }

}
