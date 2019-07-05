package com.stackroute.javape4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose stringTranspose;
    @Before
    public void setUp() {

        System.out.println("Before");
        stringTranspose = new StringTranspose();
    }

    @After

    public void tearDown() {
        System.out.println("After");
        stringTranspose= null;

    }
    @Test
    public void givenStringShouldReturnTransposeString(){

        //arrange

        //ac"

        String[] expectedValue = {"ilavaR", "ardneliahS"};

        //Act
        String[] actualValue = stringTranspose.transpose("Ravali Shailendra");
        //Assert
        assertArrayEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

    }




}