package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks stMarks=new StudentMarks();
    @Test
    public void gradesShouldBeBetween0And100()
    {
        assertEquals("true",stMarks.checkGrades(80));
    }
    @Test
    public void gradesMoreThan100ShouldReturnErrorMoreGrades()
    {
        assertEquals("more",stMarks.checkGrades(120));
    }
    @Test
    public void gradesLessThan0ShouldReturnErrorLessGrades()
    {
        assertEquals("less",stMarks.checkGrades(-20));
    }
}