package Kata01;

import Kata01.Strategy.IStrategy;

public class CashRegister {
    private final Double totalPrice;

    public CashRegister(IStrategy strategy) {
        this.totalPrice = strategy.getTotalPrice();
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }
}
