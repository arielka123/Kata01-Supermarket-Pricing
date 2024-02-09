package Kata01;

public class OrderItem {
    Double price;
    Integer quantity;

    public OrderItem(Double price, Integer quantity) {
        this.price=price;
        this.quantity=quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
