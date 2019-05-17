/**
 * Created by Sakshi
 * date- 14/05/19
 * This program is used to throw exceptions according to different conditions
 */

package com.stackroute.pe3;

public class GenerateException {

    public String giveException(String[] arr)
    {
        try{
            //if length of array is negative then throw NegativeArraySizeException
            if(arr.length<0)
            {
                System.out.println(arr.length);
            }
        }
        //catch NegativeArraySizeException
        catch (NegativeArraySizeException e)
        {
            throw new NegativeArraySizeException("Array Size Negative");
        }

        try{
            //ArrayIndexOutOfBound for i = arr.length
            for(int i=arr.length;i>=0;i++)
            {
                System.out.println(arr[i]);
            }
        }
        //catch ArrayIndexOutOfBoundException
        catch (ArrayIndexOutOfBoundsException e)
        {
            throw new ArrayIndexOutOfBoundsException("Out of bound");
        }

        try {
            //if arr is null then throw NullPointerException
            if(arr==null)
            {
                System.out.println(arr.length);
            }
        }
        //catch NullPointerException
        catch (NullPointerException e)
        {
            throw new NullPointerException("null pointer");
        }

        //catches all other Exceptions
        catch (Exception e)
        {
            System.out.println(e);
        }
        return null;
    }
}
