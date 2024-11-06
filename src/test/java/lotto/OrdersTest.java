package lotto;

import lotto.domain.Money;
import lotto.domain.Orders;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrdersTest {

    @Test
    @DisplayName("총 구매 개수 만큼 로또를 발급 한다.")
    void testCreateOrders() {
        Orders orders = new Orders(5);
        assertThat(orders.getOrders()).hasSize(5);
        assertThat(orders.getTotalOrders()).isEqualTo(5);
    }

    @Test
    @DisplayName("총 구매 금액 만큼 로또를 발급 한다.")
    void testCreateOrdersWithMoney() {
        Orders orders = new Orders(new Money(14000));
        assertThat(orders.getOrders()).hasSize(14);
        assertThat(orders.getTotalOrders()).isEqualTo(14);
    }
}
