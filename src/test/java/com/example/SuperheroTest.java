package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.ResourceLock;

class SuperheroTest {

    @Test
    void testSuperHero() {
        String name = "Cameron";
        InputStream one = new ByteArrayInputStream(name.getBytes());
        System.setIn(one);
        assertEquals("The super hero is Cameron.", Superhero.heroName());
    }
}

