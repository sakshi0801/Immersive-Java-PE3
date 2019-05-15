package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringArraysTest {

    StringArrays p2=new StringArrays();
    String[] arr1={"abc","bcd","cde"};
    String[] arr2={"bcd","abc","cde"};
    String[] arr3={"ghi","hij","abc","ghi"};

    @Test
    public void compareArrayTest()
    {
        String result=p2.compareArrays(arr1,arr2);
        assertEquals("Equal",result);
    }

    @Test
    public void compareArrayNegativeTest()
    {
        String result=p2.compareArrays(arr1,arr3);
        assertEquals("Not equal",result);
    }

    @Test
    public void removeDuplicateTest()
    {
        String[] expectResult={"hij","abc","ghi"};
        String[] result=p2.removeDuplicate(arr3);
        assertArrayEquals(expectResult,result);
    }

    @Test
    public void returnSamearrayWhenNoDuplicatesTest()
    {
        String[] expectResult={"bcd","abc","cde"};
        String[] result=p2.removeDuplicate(arr2);
        assertArrayEquals(expectResult,result);
    }

    @Test
    public void appendTest()
    {
        String[] expectResult={"bcd","abc","cde","abc"};
        String[] result=p2.appendFirst(arr1,arr2);
        assertArrayEquals(expectResult,result);
    }

    @Test
    public void prependMidTest()
    {
        String[] expectResult={"abc","abc","bcd","cde"};
        String[] result=p2.prependMid(arr1,arr2);
        assertArrayEquals(expectResult,result);
    }
}