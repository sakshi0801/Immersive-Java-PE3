/**
 * Created by Sakshi
 * date- 14/05/19
 * This program is used to test if the functions throw exceptions according to different conditions
 */

package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateExceptionTest {
    GenerateException gException=new GenerateException();

    //Test scenario 1:Given a negative array size throw NegativeArraySizeException
    @Test(expected = NegativeArraySizeException.class)
    public void negativeArraySize() {
        String[] input=new String[-5];
        assertEquals("Array Size Negative",gException.giveException(input));
    }

    //Test scenario 2:Given invalid array index throw ArrayIndexOutOfBoundsException
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void arrayIndexOutOfBound() {
        String[] input=new String[3];
        assertNotEquals("Out of bound",gException.giveException(input));
    }

    //Test scenario 3:Given a null object throw NullPointerException
    @Test(expected = NullPointerException.class)
    public void nullPointer() {
        String[] input=null;
        assertEquals("null pointer",gException.giveException(input));
    }
}