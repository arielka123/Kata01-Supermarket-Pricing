package Kata01;

public class CashRegister {
    private final Double totalPrice;

    public CashRegister(IStrategy strategy) {
        this.totalPrice = strategy.getTotalPrice();
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }
}
