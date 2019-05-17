/**
 * Created by Sakshi
 * date- 14/05/19
 * This program is used to test if the vowels are removed from input string
 */

package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConSonentTest {

    VowelConSonent vowelConSonent=new VowelConSonent();

    //Test scenario 1: Given a string with 2 vowels and consonants should return the string only with consonants
    @Test
    public void twoVowelAndAConsonent() throws Exception {
        assertEquals("bcd",vowelConSonent.removeVowel("abcde"));
    }

    //Test scenario 2: given a string with one vowel should return empty string
    @Test
    public void oneVowel() throws Exception {
        assertEquals("",vowelConSonent.removeVowel("a"));
    }

    //Test scenario 3: Given a string with all vowels should return empty string
    @Test
    public void allVowels() throws Exception {
        assertEquals("",vowelConSonent.removeVowel("aeio"));
    }

    //Test scenario 4: Given a null string return an exception "Input string cannot be null"
    @Test(expected = Exception.class)
    public void nullString() throws Exception {
        assertEquals("Input string cannot be null",vowelConSonent.removeVowel(null));
    }

    //Test scenario 5: Given a numeric value should return an exception "Input string should contain only characters"
    @Test(expected = Exception.class)
    public void notCharacters() throws Exception {
        assertEquals("Input string should contain only characters",vowelConSonent.removeVowel("sa12k"));
    }
}