package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AverageMethodTest {
    @Test
    void testSum() {
        assertEquals(100, AverageMethod.sum(40, 40, 20));
    }
    void testAverage() {
        assertEquals(60, 180);
    }
}
