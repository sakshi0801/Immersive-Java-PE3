/**
 * Created by Sakshi
 * date- 14/05/19
 * This program is used to check whether the numbers in input string are consecutive or not
 */

package com.stackroute.pe3;

public class ConsecutiveNumbers {

    public String checkNumber(String num)
    {
        //split string by " "
        String[] numbers=num.split(",");
        int[] number=new int[numbers.length];

        //convert string elements into integer and store in array
        for(int i=0;i<numbers.length;i++)
        {
            number[i]=Integer.parseInt(numbers[i]);
        }
        int flag=0;

        //check if the numbers in the array are consecutive
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
