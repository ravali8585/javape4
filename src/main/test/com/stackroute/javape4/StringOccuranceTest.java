package com.stackroute.javape4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringOccuranceTest {
    StringOccurance stringOccurance;
    @Before
    public void setUp() {

        System.out.println("Before");
        stringOccurance = new StringOccurance();
    }

    @After

    public void tearDown() {
        System.out.println("After");
        stringOccurance= null;

    }
    @Test
    public void givenCharecterShouldReturnOccuranceOfString(){

        //arrange

        //act

        String result= stringOccurance.test("Java is java again java");
        //assert
        assertEquals("Occurrence Of A Char In String: "+8,result);

    }

    @Test
    public void givenStringIsEmptyShouldReturnNull(){

        //arrange

        //act

        String result= stringOccurance.test(" ");

        //assert
        assertNull(null,result);

    }

}