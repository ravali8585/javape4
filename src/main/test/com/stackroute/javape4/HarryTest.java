package com.stackroute.javape4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryTest {

    Harry harry;
    @Before
    public void setUp() {

        System.out.println("Before");
        harry = new Harry();
    }

    @After

    public void tearDown() {
        System.out.println("After");
        harry= null;

    }
    @Test
    public void givenStringContainsHarryShouldReturnTrue(){

        //arrange

        //ac"

        boolean result= harry.harryFind("this is harry.");
        //assert
        assertEquals(true,result);
    }
    @Test
    public void givenStringShouldNotContainsHarryShouldReturnFalse(){

        //arrange

        //ac"

        boolean result= harry.harryFind("this is henry.");
        //assert
        assertEquals(false,result);
    }


}