import Kata01.CashRegister;
import Kata01.OrderItem;
import Kata01.Strategy.StandardStrategy;

public class App {
    public static void main(String[] args) {
        OrderItem orderItem = new OrderItem(3.99, 2);
        StandardStrategy standardStrategy = new StandardStrategy(orderItem);
        CashRegister cashRegister = new CashRegister(standardStrategy);
        System.out.println(cashRegister.getTotalPrice());
    }
}
