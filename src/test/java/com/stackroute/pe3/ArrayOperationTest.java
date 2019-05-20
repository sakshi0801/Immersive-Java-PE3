/**
 * Created by Sakshi
 * date- 14/05/19
 * This program is used to test operations on array
 */

package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationTest {

    private static ArrayOperation p1;
    int[] arr={10,17,20,25};

    @BeforeClass
    public static void setup() {
        p1=new ArrayOperation();
    }

    @AfterClass
    public static void teardown() {
        p1=null;
    }

    //Test Scenario 1: should print even odd for each input array element
    @Test
    public void evenOdd_GivenIntegerArray_ReturnStringArrayOfOutputValues() {
        String[] expectResult={"even","odd","even","odd"};
        String[] result=p1.evenOdd(arr);
        assertArrayEquals(expectResult,result);
    }

    //Test Scenario 2: should remove prime elements from input array
    @Test
    public void removePrime_GivenIntergerArray_ReturnNonPrimeElements() {
        int[] expectArr={10,20,25};
        int[] result=p1.removePrime(arr);
        assertArrayEquals(expectArr,result);
    }

    //Test scenario 3: should return input array when all input elements are non-prime
    @Test
    public void removePrime_InputNonPrimeElements_ReturnNonPrimeElements() {
        int[] arr1={10,20,30};
        int[] result=p1.removePrime(arr1);
        assertArrayEquals(arr1,result);
    }

    //Test scenario 4: should return null when all input elements are prime elements
    @Test
    public void removePrime_InputAllPrime_ReturnNull() {
        int[] arr2={2,3,7,11};
        int[] expectArr=null;
        int[] result=p1.removePrime(arr2);
        assertArrayEquals(expectArr,result);
    }

    //Test scenario 5: should print reverse array
    @Test
    public void reverseArr_GivenInputArray_ReturnReversedValues() {
        int[] expectArr={25,20,17,10};
        int[] result=p1.reverseArr(arr);
        assertArrayEquals(expectArr,result);
    }
}