package org.sber.phone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    private static final Phone PHONE = new Phone("89950343495", "Samsung Galaxy S20");

    @Test
    void receiveCall() {
        assertDoesNotThrow(() -> PHONE.receiveCall("VladIsLove"));
    }

    @Test
    void getNumber() {
        assertEquals("89950343495", PHONE.getNumber());
    }

    @Test
    void testReceiveCall() {
        assertDoesNotThrow(() -> PHONE.receiveCall("VladIsLove", "89827150483"));
    }

    @Test
    void sendMessage() {
        PHONE.sendMessage(new String[] { "89827150483", "89950343495" });
    }
}