package com.stackroute.javape4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReplaceTest {
    StringReplace stringReplace;
    @Before
    public void setUp() {

        System.out.println("Before");
        stringReplace = new StringReplace();
    }

    @After

    public void tearDown() {
        System.out.println("After");
        stringReplace= null;

    }
    @Test
    public void givenStringShouldReplaceDWithF(){

        //arrange

        //act

        String result= stringReplace.test("daily dry");
        //assert
        assertEquals("faily fry",result);

    }

    @Test
    public void givenStringIsEmptyShouldReturnNull(){

        //arrange

        //act

        String result= stringReplace.test("null");

        //assert
        assertEquals("null",result);

    }


}