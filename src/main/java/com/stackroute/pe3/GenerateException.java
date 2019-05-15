package com.stackroute.pe3;

public class GenerateException {

    public String giveException(String[] arr)
    {
        if(arr.length<0)
        {
            throw new NegativeArraySizeException("Array Size Negative");
        }

        if(arr[arr.length]=="0")
        {
            throw new ArrayIndexOutOfBoundsException("Out of bound");
        }
        if(arr==null)
        {
            throw new NullPointerException("null pointer");
        }
        return null;
    }
}
