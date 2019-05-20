/**
 * Created by Sakshi
 * date- 14/05/19
 * This program is used to test if the vowels are removed from input string
 */

package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConSonentTest {

    private static VowelConSonent vowelConSonent;

    @BeforeClass
    public static void setup() {
        vowelConSonent=new VowelConSonent();
    }

    @AfterClass
    public static void teardown() {
        vowelConSonent=null;
    }


    //Test scenario 1: Given a string with 2 vowels and consonants should return the string only with consonants
    @Test
    public void removeVowel_InputTwoVowelAndAConsonant_ReturnOnlyConsonants() throws Exception {
        assertEquals("bcd",vowelConSonent.removeVowel("abcde"));
    }

    //Test scenario 2: given a string with one vowel should return empty string
    @Test
    public void removeVowel_InputOneVowel_ReturnEmptyString() throws Exception {
        assertEquals("",vowelConSonent.removeVowel("a"));
    }

    //Test scenario 3: Given a string with all vowels should return empty string
    @Test
    public void removeVowel_InputAllVowels_ReturnEmptyString() throws Exception {
        assertEquals("",vowelConSonent.removeVowel("aeio"));
    }

    //Test scenario 4: Given a null string return an exception "Input string cannot be null"
    @Test(expected = Exception.class)
    public void removeVowel_InputNullString_ThrowException() throws Exception {
        assertEquals("Input string cannot be null",vowelConSonent.removeVowel(null));
    }

    //Test scenario 5: Given a numeric value should return an exception "Input string should contain only characters"
    @Test(expected = Exception.class)
    public void removeVowel_InputDigits_ThrowExceptionShouldContainOnlyCharacters() throws Exception {
        assertEquals("Input string should contain only characters",vowelConSonent.removeVowel("sa12k"));
    }
}