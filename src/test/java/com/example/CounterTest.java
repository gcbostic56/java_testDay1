package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CounterTest {
    @Test
    void testNumber() {
        Counter counter = new Counter(50);
        assertEquals(50, counter.value());
    }
    void testString() {
        Counter counter = new Counter(50);
        assertEquals("The number = 50", counter.toString());
    }
}
