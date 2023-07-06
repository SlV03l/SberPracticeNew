package org.sber;

import org.sber.exceptions.*;

public class BankOnline {
    private static final String[] blockedCards = {
            "1111111111111111",
            "2222222222222222",
            "3333333333333333"
    };

    private boolean isCardBlocked(String cardNumber) {
        for (String blockedCard : blockedCards) {
            if (blockedCard.equals(cardNumber)) {
                return true;
            }
        }
        return false;
    }

    public void send(String cardNumber, Double money) throws BankOnlineException {
        if (cardNumber == null || money == null) {
            throw new NullPointerException();
        }

        if (!cardNumber.matches("\\d{16}")) {
            throw new InvalidCardNumberException();
        }

        if (isCardBlocked(cardNumber)) {
            throw new BlockedCardException();
        }

        if (money < 0) {
            throw new NegativeAmountException();
        }

        if (money > 50000) {
            throw new LimitExceededException();
        }
    }
}
