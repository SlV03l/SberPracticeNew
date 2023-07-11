package org.sber.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataContainerTest {
    private static final DataContainer DATA_CONTAINER = new DataContainer();

    @Test
    void testLombokFunctionality() {
        assertDoesNotThrow(() -> DATA_CONTAINER.setStringValue("hello"));
        assertEquals(DATA_CONTAINER.getStringValue(), "hello");
    }

}