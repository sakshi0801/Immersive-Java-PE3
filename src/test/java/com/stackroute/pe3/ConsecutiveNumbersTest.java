/**
 * Created by Sakshi
 * date- 14/05/19
 * This program is used to test whether the numbers in input string are consecutive or not
 */

package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    private static ConsecutiveNumbers conNumbers;

    @BeforeClass
    public static void setup() {
        conNumbers=new ConsecutiveNumbers();
    }

    @AfterClass
    public static void teardown() {
        conNumbers=null;
    }

    //Test scenario 1: Given 98,96,95,94,93 should return "Non consecutive numbers"
    @Test
    public void seriesShouldReturnNonConsecutive_One() {
        String input="98,96,95,94,93";
        String expectOutput="Non consecutive numbers";
        assertEquals(expectOutput,conNumbers.checkNumber(input));
    }

    //Test scenario 2: Given 54,53,52,51,50,49,48 should return "Consecutive numbers"
    @Test
    public void seriesShouldReturnConsecutive_One() {
        String input="54,53,52,51,50,49,48";
        String expectOutput="Consecutive numbers";
        assertEquals(expectOutput,conNumbers.checkNumber(input));
    }

    //Test scenario 3: Given 6,6,6,6,6,6 should return "Non consecutive numbers"
    @Test
    public void seriesShouldReturnNonConsecutive_Two() {
        String input="6,6,6,6,6,6";
        String expectOutput="Non consecutive numbers";
        assertEquals(expectOutput,conNumbers.checkNumber(input));
    }

    //Test scenario 4: Given 0,-1,-2,-3,-4,-5 should return "Consecutive numbers"
    @Test
    public void seriesShouldReturnConsecutive_Two() {
        String input="0,-1,-2,-3,-4,-5";
        String expectOutput="Consecutive numbers";
        assertEquals(expectOutput,conNumbers.checkNumber(input));
    }
}