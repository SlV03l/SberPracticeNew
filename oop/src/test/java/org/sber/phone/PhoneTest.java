package org.sber.phone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    private static final Phone phone = new Phone("89950343495", "Samsung Galaxy S20");

    @Test
    void receiveCall() {
        assertDoesNotThrow(() -> phone.receiveCall("VladIsLove"));
    }

    @Test
    void getNumber() {
        assertEquals("89950343495", phone.getNumber());
    }

    @Test
    void testReceiveCall() {
        assertDoesNotThrow(() -> phone.receiveCall("VladIsLove", "89827150483"));
    }

    @Test
    void sendMessage() {
        phone.sendMessage(new String[] { "89827150483", "89950343495" });
    }
}