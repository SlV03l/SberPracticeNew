package org.sber;

public class CapybaraSounding implements Sounding {
    @Override
    public void sound() {
        System.out.println("Purr");
    }

    public void capybaraSleeping() {
        System.out.println("Capybara ZzZ");
    }

    public static void capybaraMusic() {
        System.out.println("Какибара (Капибара) Капибара,-капибара-капибара-капибара");
    }
}
