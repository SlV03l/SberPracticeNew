package org.sber;

import org.junit.jupiter.api.Test;
import org.sber.exceptions.*;

import static org.junit.jupiter.api.Assertions.*;

class BankOnlineTest {

    @Test
    void send() {
        BankOnline bankOnline = new BankOnline();

        assertDoesNotThrow(() -> bankOnline.send("1234567890123456", 100.0));

        assertThrows(InvalidCardNumberException.class, () -> bankOnline.send("12345", 100.0));

        assertThrows(BlockedCardException.class, () -> bankOnline.send("1111111111111111", 100.0));

        assertThrows(NegativeAmountException.class, () -> bankOnline.send("1234567890123456", -100.0));

        assertThrows(LimitExceededException.class, () -> bankOnline.send("1234567890123456", 60000.0));

        assertThrows(NullPointerException.class, () -> bankOnline.send(null, 100.0));
    }
}