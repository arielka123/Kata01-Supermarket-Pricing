package Kata01;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class PromotionStrategyTest {
@Test
    void getTotalPrice() {
        //given
        IStrategy promotionStrategy = new PromotionStrategy();

        //then
        assertThat(promotionStrategy.getTotalPrice(), Matchers.is(0.0));
    }
}
