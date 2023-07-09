package org.sber;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SoundingTest {
    @Test
    void sound() {
        List<Sounding> soundList = new ArrayList<>();

        CapybaraSounding capybaraSounding = new CapybaraSounding();
        AlligatorSounding alligatorSounding = new AlligatorSounding();

        soundList.add(capybaraSounding);
        soundList.add(new AlligatorSounding());
        soundList.forEach(Sounding::sound);

        soundList.add(new Sounding() {
            @Override
            public void sound() {
                System.out.println("oink oink");
            }
        });

        soundList.forEach(Sounding::sound);

        soundList.add(() -> System.out.println("crowing"));
        soundList.forEach(Sounding::sound);

        soundList.add(capybaraSounding::capybaraSleeping);
        soundList.add(CapybaraSounding::capybaraMusic);
        soundList.forEach(Sounding::sound);
    }
}