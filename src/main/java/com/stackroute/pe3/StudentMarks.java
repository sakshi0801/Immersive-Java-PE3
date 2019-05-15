package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {
    public static String checkGrades(int grade)
    {
        if(grade>=0 && grade<=100)
        {
            return "true";
        }
        else if(grade<0)
        {
            return "less";
        }
        else
        {
            return "more";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int numOfStudents=sc.nextInt();
        int[] stuGrades=new int[numOfStudents];
        for(int i=0;i<numOfStudents;i++)
        {
            System.out.print("Enter grades for student "+(i+1));
            stuGrades[i]=sc.nextInt();
            while(checkGrades(stuGrades[i])!="true"){
                if(checkGrades(stuGrades[i])=="less"){
                    System.err.println("Input should be greater than 0");
                }
                else if(checkGrades(stuGrades[i])=="more")
                {
                    System.err.println("Input should be less than 100");
                }
                System.out.print("Enter grades for student "+(i+1));
                stuGrades[i]=sc.nextInt();
            }
        }
    }
}
