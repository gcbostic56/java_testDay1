package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MethodReturnTypesTest {
    @Test
    void testWords() {
        assertEquals("Matt, here you go. Hope you enjoyed Picante. It was nice seeing you have some fun.", MethodReturnTypes.words());
    }
    void testNumbers() {
        assertEquals(69, MethodReturnTypes.returnNumber());
    }
    void testFalse() {
        assertEquals(false, MethodReturnTypes.trueFalse());
    }
}
