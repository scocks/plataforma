package org.king.plataforma;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testCount() {
        Library library = new Library();
        String[] result = library.count(10);
        assertEquals(10, result.length);
        for (int i = 0; i < 10; i++) {
            assertEquals("i = " + i, result[i]);
        }
    }
    @Test
    void testGreetAll() {
        Library library = new Library();
        ArrayList<String> result = library.greetAll("plataforma");
        assertEquals(6,result.size());
        assertEquals("Hello from plataforma, plataforma!", result.get(0));
        assertEquals("Hello, plataforma!", result.get(1));
        assertEquals("Greetings, plataforma!", result.get(2));
        assertEquals("Salutations, plataforma!", result.get(3));
        assertEquals("Hej, plataforma!", result.get(4));
        assertEquals("Kon'nichiwa, plataforma!", result.get(5));
    }
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("plataforma");
        assertEquals("Hello from plataforma, plataforma!", result);
    }
    @Test
    void testGreet1() {
        Library library = new Library();
        String result = library.greet1("plataforma");
        assertEquals("Hello, plataforma!", result);
    }
    @Test
    void testGreet2() {
        Library library = new Library();
        String result = library.greet2("plataforma");
        assertEquals("Greetings, plataforma!", result);
    }
    @Test
    void testGreet3() {
        Library library = new Library();
        String result = library.greet3("plataforma");
        assertEquals("Salutations, plataforma!", result);
    }
    @Test
    void testGreet4() {
        Library library = new Library();
        String result = library.greet4("plataforma");
        assertEquals("Hej, plataforma!", result);
    }
    @Test
    void testGreet5() {
        Library library = new Library();
        String result = library.greet5("plataforma");
        assertEquals("Kon'nichiwa, plataforma!", result);
    }
}
