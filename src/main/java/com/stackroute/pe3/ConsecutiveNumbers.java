package com.stackroute.pe3;

public class ConsecutiveNumbers {

    public String checkNumber(String num)
    {
        String[] numbers=num.split(",");
        int[] number=new int[numbers.length];
        for(int i=0;i<numbers.length;i++)
        {
            number[i]=Integer.parseInt(numbers[i]);
        }

        int flag=0;
        for(int i=0;i<number.length-1;i++)
        {
            if(number[i+1]==(number[i]-1))
            {
                flag=1;
            }
            else {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            return "Consecutive numbers";
        }
        else{
            return "Non consecutive numbers";
        }
    }

}
