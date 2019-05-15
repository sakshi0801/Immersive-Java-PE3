package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateExceptionTest {
    GenerateException gException=new GenerateException();

    @Test(expected = NegativeArraySizeException.class)
    public void negativeArraySize()
    {
        String[] input=new String[-5];
        assertEquals("Array Size Negative",gException.giveException(input));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void arrayIndexOutOfBound()
    {
        String[] input={"1","2","3"};
        assertEquals("Out of bound",gException.giveException(input));
    }

    @Test(expected = NullPointerException.class)
    public void nullPointer()
    {
        String[] input=null;
        assertEquals("null pointer",gException.giveException(input));
    }
}