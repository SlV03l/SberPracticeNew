package org.sber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void T1() {
        IntStream intStream1 = IntStream.of(45, 122, 89, 67, 334, 223, 56, 78, 98, 10);
        intStream1.filter(num -> num >=10 && num <= 99).sorted().forEach(System.out::println);

        IntStream intStream2 = IntStream.of(45, 122, 89, 67, 334, 223, 56, 78, 98, 10);
        double average = intStream2.average().orElse(0.0);
        assertEquals(112.2, average, 0.01);
        System.out.println("Avr: " + average);
    }

    @Test
    void T3() {
        Stream<String> stringStream = Stream.of("VlaD", "iS", "LoVe");

        Stream<StreamContainer> containerStream = stringStream
                .map(str -> new StreamContainer(str, new Random().nextLong(100)));
        containerStream.forEach(container ->
                System.out.printf("Name: %s, Count: %s; ", container.getName(), container.getCount()));

        Stream<String> stringStream2 = Stream.of("Apple", "Banana", "Orange", "Mango");
        Map<Long, String> containerMap = stringStream2
                .collect(Collectors.toMap(str -> new Random().nextLong(100), str -> str
        ));
        System.out.println("\nMap: " + containerMap);
    }

    @Test
    void T4() {
        Map<String, List<Long>> containerMap = new HashMap<>();
        containerMap.put("Group1", new ArrayList<>(List.of(1L, 2L, 3L)));
        containerMap.put("Group2", new ArrayList<>(List.of(1L, 2L, 3L, 4L, 5L)));

        Stream<StreamContainer> containerStream = containerMap.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream()
                        .map(value -> new StreamContainer(entry.getKey(), value)));

        List<StreamContainer> streamContainerList = containerStream.toList();
        long count = streamContainerList.stream().count();

        assertEquals(count, 8);
    }

    @Test
    void T5() {
        String boolString = "1100100101";

        Stream<Boolean> booleanStream = boolString.chars().mapToObj(ch -> ch == '1');

        boolean result = booleanStream.reduce(true, (a, b) -> a && b);
        System.out.printf("Res: " + result);
        assertFalse(result);
    }
}