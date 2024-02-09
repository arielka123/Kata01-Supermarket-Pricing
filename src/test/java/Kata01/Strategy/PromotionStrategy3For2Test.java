package Kata01.Strategy;

import Kata01.OrderItem;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PromotionStrategy3For2Test {
    @Test
    void getTotalPriceIfQuantityEqual3() {
        //given
        IStrategy promotionStrategy = new PromotionStrategy3For2(new OrderItem(2.0, 3));

        //then
        double totalPrice = promotionStrategy.getTotalPrice();
        assertThat(totalPrice, equalTo(4.0));
    }


    @Test
    void getTotalPriceIfQuantityEqual10() {
        //given
        IStrategy promotionStrategy = new PromotionStrategy3For2(new OrderItem(2.0, 10));

        //then
        double totalPrice = promotionStrategy.getTotalPrice();
        assertThat(totalPrice, equalTo(14.0));
    }

}
