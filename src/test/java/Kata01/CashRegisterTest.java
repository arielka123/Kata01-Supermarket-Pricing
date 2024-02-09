package Kata01;

import Kata01.Strategy.IStrategy;
import Kata01.Strategy.StandardStrategy;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

class CashRegisterTest {

    @Test
    void getTotalPriceFromStandardStrategyForOneItem() {
        //given
        OrderItem orderItem = new OrderItem(2.00, 2);
        IStrategy strategy = new StandardStrategy(orderItem);
        CashRegister cashRegister = new CashRegister(strategy);

        //when
        double price = cashRegister.getTotalPrice();

        //then
        assertThat(price, not(equalTo(0.0)));
        assertThat(price, equalTo(4.0));
    }
}