package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {


    //String firstName
    //String lastName
    //Double [] testScore


    @Test
    public void testStudentConstructor(){
        Student student = new Student("", "", 0.0);

        int expected = classroom[0];
        int actual = classroom.getStudent(0.0);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetFirstName(){
        Student student = new Student("Jake", "", 0.0);
        String actual = student.getFirstName();
        String expected = "Jake";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetFirstName(){
        Student student = new Student("", "", 0.0);
        String expected = "Jake";
        student.setFirstName("Jake");

        Assert.assertEquals(expected, student.getFirstName());
    }
    @Test
    public void testGetLastName(){
        Student student = new Student("", "Ciaffi", 0.0);
        String expected = "Ciaffi";

        Assert.assertEquals(expected, student.getLastName());
    }
    @Test
    public void testSetLastName(){
        Student student = new Student("", "", 0.0);
        String expected = "Ciaffi";
        student.seLastName("Ciaffi");

        Assert.assertEquals(expected, student.getLastName());
    }
    @Test
    public void testGetTestScore(){
        Student student = new Student("", "", 01.0);
        double expected = 1.0;

        Assert.assertEquals(expected, student.getTestScore());
    }
    @Test
    public void testSetTestScore(){
        Student student = new Student("", "", 0.0);
        double expected = 1.0;
        student.setTestScore(1.0);

        Assert.assertEquals(expected, student.getTestScore());
    }

}