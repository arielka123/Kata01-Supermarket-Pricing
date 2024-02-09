package Kata01.Strategy;

import Kata01.OrderItem;

public class PromotionStrategy3For2 implements IStrategy {
    double itemPrice;
    int orderedQuantity;
    int bonusQuantity=0;
    int payedQuantity=0;
    int counter;

    public PromotionStrategy3For2(OrderItem orderItem) {
        this.itemPrice = orderItem.getPrice();
        this.orderedQuantity = orderItem.getQuantity();
    }

    @Override
    public double getTotalPrice() {
        payedQuantity= orderedQuantity;
        counter = orderedQuantity;

        while (counter >2){
           counter = counter -3;
           payedQuantity=payedQuantity-1;
           bonusQuantity ++;
       }

        System.out.println("Bonusowa ilośc: "+bonusQuantity);
        System.out.println("Zapłacono za: "+payedQuantity);
        return payedQuantity *itemPrice;
    }

    @Override
    public int getPayedQuantity() {
        return payedQuantity;
    }

    @Override
    public int getOrderedQuantity() {
        return this.orderedQuantity;
    }
}
