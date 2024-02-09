package Kata01.Strategy;

import Kata01.OrderItem;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

class StandardStrategyTest {

    @org.junit.jupiter.api.Test
    void getTotalPriceFor() {
        //given
        IStrategy standardStrategy = new StandardStrategy(new OrderItem(2.0, 3));
        //when
        double totalPrice = standardStrategy.getTotalPrice();
        //then
        assertThat(totalPrice, not(equalTo(0.0)));
        assertThat(totalPrice, equalTo(6.0));
    }
}