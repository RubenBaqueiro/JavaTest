package org.example;

import org.junit.Test;

import static org.example.util.StringUtil.*;
import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void string_not_empty() {
        assertEquals(false, isEmpty("hola"));
    }

    @Test
    public void quotation_isEmpty(){
        assertEquals(true, isEmpty(""));
    }

    @Test
    public void null_isEmpty(){
        assertEquals(true, isEmpty(null));
    }

    @Test
    public void string_with_spaces_isEmpty() {
        assertEquals(true, isEmpty(" "));
    }
}

