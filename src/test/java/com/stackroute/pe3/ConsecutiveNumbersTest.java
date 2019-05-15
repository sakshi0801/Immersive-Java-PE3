package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    ConsecutiveNumbers conNumbers=new ConsecutiveNumbers();
    @Test
    public void seriesShouldReturnNonConsecutiveOne()
    {
        String input="98,96,95,94,93";
        String expectOutput="Non consecutive numbers";
        assertEquals(expectOutput,conNumbers.checkNumber(input));
    }
    @Test
    public void seriesShouldReturnConsecutiveOne()
    {
        String input="54,53,52,51,50,49,48";
        String expectOutput="Consecutive numbers";
        assertEquals(expectOutput,conNumbers.checkNumber(input));
    }
    @Test
    public void seriesShouldReturnNonConsecutiveTwo()
    {
        String input="6,6,6,6,6,6";
        String expectOutput="Non consecutive numbers";
        assertEquals(expectOutput,conNumbers.checkNumber(input));
    }
    @Test
    public void seriesShouldReturnConsecutiveTwo()
    {
        String input="0,-1,-2,-3,-4,-5";
        String expectOutput="Consecutive numbers";
        assertEquals(expectOutput,conNumbers.checkNumber(input));
    }

}