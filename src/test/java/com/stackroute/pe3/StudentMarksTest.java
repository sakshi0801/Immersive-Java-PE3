/**
 * Created by Sakshi
 * date- 14/05/19
 * This program is used to test if the entered grade is between 0 and 100, more than 100 or less than 0
 */

package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks stMarks=new StudentMarks();

    //Test scenario 1: Given a number between 0 to 100 should return true
    @Test
    public void gradesShouldBeBetween0And100()
    {
        assertEquals("true",stMarks.checkGrades(80));
    }

    //Test scenario 2: Given a number greater than 100 should return message "Input should be less than 100"
    @Test
    public void gradesMoreThan100ShouldReturnErrorMoreGrades()
    {
        assertEquals("more",stMarks.checkGrades(120));
    }

    //Test scenario 3: Given a number less than 0 should return message "Input should be greater than 0"
    @Test
    public void gradesLessThan0ShouldReturnErrorLessGrades()
    {
        assertEquals("less",stMarks.checkGrades(-20));
    }
}