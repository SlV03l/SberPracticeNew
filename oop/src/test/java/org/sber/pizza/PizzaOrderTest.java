package org.sber.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {

    private static final PizzaOrder pizza = new PizzaOrder(
            "пепперони",
            PizzaOrder.Size.SMALL,
            false,
            "ул. Пушкина, дом Колотушкина 39 - 35");

    @Test
    void order() {
        pizza.order();
    }

    @Test
    void cancel() {
        pizza.cancel();
    }

    @Test
    void testToString() {
        System.out.println(pizza.toString());
    }
}