/**
 * Created by Sakshi
 * date- 14/05/19
 * This program is used to test whether the numbers in input string are consecutive or not
 */

package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    ConsecutiveNumbers conNumbers=new ConsecutiveNumbers();

    //Test scenario 1: Given 98,96,95,94,93 should return "Non consecutive numbers"
    @Test
    public void seriesShouldReturnNonConsecutiveOne() {
        String input="98,96,95,94,93";
        String expectOutput="Non consecutive numbers";
        assertEquals(expectOutput,conNumbers.checkNumber(input));
    }

    //Test scenario 2: Given 54,53,52,51,50,49,48 should return "Consecutive numbers"
    @Test
    public void seriesShouldReturnConsecutiveOne() {
        String input="54,53,52,51,50,49,48";
        String expectOutput="Consecutive numbers";
        assertEquals(expectOutput,conNumbers.checkNumber(input));
    }

    //Test scenario 3: Given 6,6,6,6,6,6 should return "Non consecutive numbers"
    @Test
    public void seriesShouldReturnNonConsecutiveTwo() {
        String input="6,6,6,6,6,6";
        String expectOutput="Non consecutive numbers";
        assertEquals(expectOutput,conNumbers.checkNumber(input));
    }

    //Test scenario 4: Given 0,-1,-2,-3,-4,-5 should return "Consecutive numbers"
    @Test
    public void seriesShouldReturnConsecutiveTwo() {
        String input="0,-1,-2,-3,-4,-5";
        String expectOutput="Consecutive numbers";
        assertEquals(expectOutput,conNumbers.checkNumber(input));
    }
}