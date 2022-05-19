package com.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class GreetingsTest {
    @Test
    public void testMethodGreetings() {
        // Greetings InputOut = new Greetings();

        String Nick = "Cameron";
        InputStream in = new ByteArrayInputStream(Nick.getBytes());
        System.setIn(in);
        assertEquals("Cameron", Greetings.getInput());
    }
}   
