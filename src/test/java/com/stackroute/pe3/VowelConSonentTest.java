package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConSonentTest {

    VowelConSonent vowelConSonent=new VowelConSonent();

    @Test
    public void twoVowelAndAConsonent() throws Exception {
        assertEquals("bcd",vowelConSonent.removeVowel("abcde"));
    }

    @Test
    public void oneVowel() throws Exception {
        assertEquals("",vowelConSonent.removeVowel("a"));
    }

    @Test
    public void allVowels() throws Exception {
        assertEquals("",vowelConSonent.removeVowel("aeio"));
    }

    @Test(expected = Exception.class)
    public void nullString() throws Exception {
        assertEquals("Input string cannot be null",vowelConSonent.removeVowel(null));
    }

    @Test(expected = Exception.class)
    public void notCharacters() throws Exception {
        assertEquals("Input string should contain only characters",vowelConSonent.removeVowel("sa12k"));
    }
}