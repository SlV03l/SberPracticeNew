package org.sber;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericCollectionTest {

    @Test
    public void testCountElements() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int count = GenericCollection.countElements(numbers);
        assertEquals(5, count);
    }

    @Test
    public void testSwapElements() {
        List<String> names = new ArrayList<>(Arrays.asList("Minions", "Banana", "Gru", "Bob"));
        GenericCollection.swapElements(names, 1, 3);
        assertEquals("Bob", names.get(1));
        assertEquals("Banana", names.get(3));
    }
}
