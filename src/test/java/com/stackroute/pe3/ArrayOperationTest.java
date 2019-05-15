package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationTest {

    ArrayOperation p1=new ArrayOperation();
    int[] arr={10,17,20,25};
    @Test
    public void evenOddTest() {
        String[] expectResult={"even","odd","even","odd"};
        String[] result=p1.evenOdd(arr);
        assertArrayEquals(expectResult,result);
    }

    @Test
    public void primeTest()
    {
        int[] expectArr={10,20,25};
        int[] result=p1.removePrime(arr);
        assertArrayEquals(expectArr,result);
    }

    @Test
    public void primeNonTest()
    {
        int[] arr1={10,20,30};
        int[] result=p1.removePrime(arr1);
        assertArrayEquals(arr1,result);
    }

    @Test
    public void primeEdgeTest()
    {
        int[] arr2={2,3,7,11};
        int[] expectArr=null;
        int[] result=p1.removePrime(arr2);
        assertArrayEquals(expectArr,result);
    }

    @Test
    public void reverseTest()
    {
        int[] expectArr={25,20,17,10};
        int[] result=p1.reverseArr(arr);
        assertArrayEquals(expectArr,result);
    }
}