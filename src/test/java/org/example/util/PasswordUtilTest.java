package org.example.util;

import org.junit.Test;

import static org.example.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void weak_when_less_than_8_letters(){
        assertEquals(WEAK,PasswordUtil.assessPassword("12345678"));
    }

    @Test
    public void weak_when_only_letters(){
        assertEquals(WEAK,PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public void medium_when_letters_numbers(){
        assertEquals(MEDIUM,PasswordUtil.assessPassword("abcd1234"));
    }

    @Test
    public void strong_when_letters_numbers_symbols(){
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd123!"));
    }

}