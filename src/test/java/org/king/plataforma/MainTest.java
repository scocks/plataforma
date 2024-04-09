package org.king.plataforma;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {    
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("plataforma");
        assertEquals("greet from plataforma, plataforma", result);
    }
    @Test
    void testGreet1() {
        Library library = new Library();
        String result = library.greet1("plataforma");
        assertEquals("greet1 from plataforma greet from libdep1, plataforma", result);
    }
    @Test
    void testGreet2() {
        Library library = new Library();
        String result = library.greet2("plataforma");
        assertEquals("greet2 from plataforma greet from libdep2, plataforma", result);
    }
    @Test
    void testGreet3() {
        Library library = new Library();
        String result = library.greet3("plataforma");
        assertEquals("greet3 from plataforma greet from libdep3, plataforma", result);
    }
    @Test
    void testGreet4() {
        Library library = new Library();
        String result = library.greet4("plataforma");
        assertEquals("greet4 from plataforma greet from libdep4, plataforma", result);
    }
    @Test
    void testGreet5() {
        Library library = new Library();
        String result = library.greet5("plataforma");
        assertEquals("greet5 from plataforma greet from libdep5, plataforma", result);
    }
    @Test
    void testGreet6() {
        Library library = new Library();
        String result = library.greet6("plataforma");
        assertEquals("greet6 from plataforma, plataforma", result);
    }
}
