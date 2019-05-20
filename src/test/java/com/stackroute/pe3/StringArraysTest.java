/**
 * Created by Sakshi
 * date- 14/05/19
 * This program is used to test operations like compare,remove duplicate, append and
 * prepend operations on string arrays
 */

package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringArraysTest {

    private static StringArrays p2;

    @BeforeClass
    public static void setup() {
        p2=new StringArrays();
    }

    @AfterClass
    public static void teardown() {
        p2=null;
    }

    String[] arr1={"abc","bcd","cde"};
    String[] arr2={"bcd","abc","cde"};
    String[] arr3={"ghi","hij","abc","ghi"};

    //Test scenario 1: should return "Equal" if all elements are same in two string arrays
    @Test
    public void compareArrays_GivenInputArrays_ReturnEqual() {
        String result=p2.compareArrays(arr1,arr2);
        assertEquals("Equal",result);
    }

    //Test scenario 2: should return "Not equal" if any one of the elements are not equal
    @Test
    public void compareArrays_GivenInputArrays_ReturnNotEqual() {
        String result=p2.compareArrays(arr1,arr3);
        assertEquals("Not equal",result);
    }

    //Test scenario 3: should remove duplicate values in array and return array
    @Test
    public void removeDuplicate_GivenInputArray_ReturnDistinctValues() {
        String[] expectResult={"hij","abc","ghi"};
        String[] result=p2.removeDuplicate(arr3);
        assertArrayEquals(expectResult,result);
    }

    //Test scenario 4: should return same array when no duplicates are there
    @Test
    public void removeDuplicates_NoDuplicateInputs_ReturnSameArray() {
        String[] expectResult={"bcd","abc","cde"};
        String[] result=p2.removeDuplicate(arr2);
        assertArrayEquals(expectResult,result);
    }

    //Test scenario 5: should append first element of arr1 in arr2
    @Test
    public void appendFirst_GivenTwoArray_ReturnFirstElementOfArray1AppendedToArray2() {
        String[] expectResult={"bcd","abc","cde","abc"};
        String[] result=p2.appendFirst(arr1,arr2);
        assertArrayEquals(expectResult,result);
    }

    //Test scenario 6: should prepend mid element of arr2 in arr1
    @Test
    public void prependMid_GivenTwoArray_ReturnMidElementOfArray2PrependToArray1() {
        String[] expectResult={"abc","abc","bcd","cde"};
        String[] result=p2.prependMid(arr1,arr2);
        assertArrayEquals(expectResult,result);
    }
}