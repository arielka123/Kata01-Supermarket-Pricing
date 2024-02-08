package Kata01;

import org.hamcrest.Matchers;
import static org.hamcrest.MatcherAssert.assertThat;

class StandardStrategyTest {

    @org.junit.jupiter.api.Test
    void getTotalPrice() {
        //given
        IStrategy standardStrategy = new StandardStrategy();

        //when
        double totalPrice = standardStrategy.getTotalPrice();
        //then
        assertThat(totalPrice, Matchers.is(0.0));
    }
}