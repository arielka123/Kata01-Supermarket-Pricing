import Kata01.CashRegister;
import Kata01.StandardStrategy;

public class App {
    public static void main(String[] args) {
        StandardStrategy standardStrategy = new StandardStrategy();
        CashRegister cashRegister = new CashRegister(standardStrategy);
        System.out.println(cashRegister.getTotalPrice());
    }
}
