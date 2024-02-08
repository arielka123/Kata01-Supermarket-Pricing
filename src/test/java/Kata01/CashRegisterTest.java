package Kata01;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CashRegisterTest {

    @Test
    void getTotalPriceFromStandardStrategy() {
        //given
        IStrategy strategy = new StandardStrategy();
        CashRegister cashRegister = new CashRegister(strategy);

        //when
        double price = cashRegister.getTotalPrice();

        //then
        assertThat(price, equalTo(0.0));
    }
}