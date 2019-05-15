package com.stackroute.pe3;

public class ArrayOperation {
    public String[] evenOdd(int[] num) {
        String[] result=new String[num.length];
        for(int flag=0;flag<num.length;flag++)
        {
            if(num[flag]%2==0)
            {
                result[flag]="even";
            }
            else{
                result[flag]="odd";
            }
        }
        return result;
    }

    public int[] removePrime(int[] num) {
        int count=0;
        for (int flag=0;flag<num.length;flag++)
        {
            for(int div=2;div<num[flag]/2;div++)
            {
                if(num[flag]%div==0)
                {
                    count++;
                    break;
                }
            }
        }
        int[] result=new int[count];
        if(count==num.length)
        {
            return num;
        }
        else if(count==0)
        {
            return null;
        }
        else {
            int resIndex=0;
            for (int flag=0;flag<num.length;flag++)
            {
                for(int div=2;div<num[flag]/2;div++)
                {
                    if(num[flag]%div==0)
                    {
                        result[resIndex]=num[flag];
                        resIndex++;
                        break;
                    }
                }
            }
            return result;
        }
    }

    public int[] reverseArr(int[] num) {
        int[] result=new int[num.length];
        for(int flag1=0,flag2=num.length-1;flag1<num.length&&flag2>=0;flag1++,flag2--)
        {
            result[flag2]=num[flag1];
        }
        return result;
    }
}