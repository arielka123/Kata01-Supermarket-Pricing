import Kata01.CashRegister;
import Kata01.OrderItem;
import Kata01.Strategy.IStrategy;
import Kata01.Strategy.PromotionStrategy3For2;

public class App {
    public static void main(String[] args) {
        OrderItem orderItem = new OrderItem(2.0, 5);

        IStrategy strategy = new PromotionStrategy3For2(orderItem);
        CashRegister cashRegister = new CashRegister(strategy);

        System.out.println(cashRegister.getTotalPrice());
    }
}
