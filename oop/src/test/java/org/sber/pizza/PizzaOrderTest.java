package org.sber.pizza;

import org.junit.jupiter.api.Test;

class PizzaOrderTest {

    private static final PizzaOrder PIZZA = new PizzaOrder(
            "пепперони",
            PizzaOrder.Size.SMALL,
            false,
            "ул. Пушкина, дом Колотушкина 39 - 35");

    @Test
    void order() {
        PIZZA.order();
    }

    @Test
    void cancel() {
        PIZZA.cancel();
    }

    @Test
    void testToString() {
        System.out.println(PIZZA.toString());
    }
}
