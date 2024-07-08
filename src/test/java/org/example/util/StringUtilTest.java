package org.example.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {

    @Test
    public void repeat_string_once () {
        assertEquals("HolaHolaHola", String.repeat("Hola", 3));
    }

    @Test
    public void repeat_string_multiple () {
        assertEquals("Hola", String.repeat("Hola", 1));
    }
    @Test
    public void repeat_string_zero () {
        assertEquals("", String.repeat("Hola", 0));
    }

    @Test (expected = IllegalArgumentException.class)
    public void repeat_string_negative () {
        String.repeat("Hola", -1);
    }





}