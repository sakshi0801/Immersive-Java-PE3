package com.stackroute.pe3;

public class StringArrays {

    public String compareArrays(String[] arr1,String[] arr2)
    {
        if(arr1.length==arr2.length)
        {
            boolean test=false;
            for(int flag1=0;flag1<arr1.length;flag1++)
            {
                for(int flag2=0;flag2<arr2.length;flag2++)
                {
                    if(arr1[flag1].equals(arr2[flag2]))
                    {
                        test=true;
                        break;
                    }
                    else {
                        test=false;
                    }
                }
                if(test==false)
                {
                    break;
                }
            }
            if(test==false)
            {
                return "Not equal";
            }
            else {
                return "Equal";
            }
        }
        else {
            return "Not equal";
        }
    }

    public String[] removeDuplicate(String[] arr)
    {
        int count=0;
        for(int flag1=0;flag1<arr.length-1;flag1++)
        {
            for(int flag2=flag1+1;flag2<arr.length;flag2++)
            {
                if(arr[flag1].equals(arr[flag2]))
                {
                    count++;
                    break;
                }
            }
        }
        if(count!=0)
        {
            int f=0;
            String[] result=new String[arr.length-count];
            for(int i=0;i<result.length;i++)
            {
                result[i]="";
            }
            int index=0;
            for(int flag1=0;flag1<arr.length-1;flag1++)
            {
                for(int flag2=flag1+1;flag2<arr.length;flag2++)
                {
                    if(arr[flag1].equals(arr[flag2]))
                    {
                        f=1;
                        break;
                    }
                    else {
                        f=0;
                    }
                }
                if(f==0)
                {
                    result[index]+=arr[flag1];
                    index++;
                }
            }
            result[index]=arr[arr.length-1];
            return result;
        }
        else {
            return arr;
        }
    }

    public String[] appendFirst(String[] arr1,String[] arr2)
    {
        String[] result=new String[arr2.length+1];
        for(int i=0;i<arr2.length;i++)
        {
            result[i]=arr2[i];
        }
        result[result.length-1]=arr1[0];
        return result;
    }

    public String[] prependMid(String[] arr1,String[] arr2)
    {
        String mid=arr2[arr2.length/2];
        String[] result=new String[arr1.length+1];
        result[0]=mid;
        for (int i=1,j=0;i<result.length&&j<arr1.length;i++,j++)
        {
            result[i]=arr1[j];
        }
        return result;
    }
}
