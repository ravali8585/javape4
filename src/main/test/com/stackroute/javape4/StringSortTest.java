package com.stackroute.javape4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringSortTest {
    StringSort stringSort;
    @Before
    public void setUp() throws Exception {

        System.out.println("Before");
        stringSort = new StringSort();
    }

    @After

    public void tearDown() throws Exception{
        System.out.println("After");
        stringSort= null;

    }
    @Test
    public void givenStringShouldReturnSortedString() throws  Exception{

        //arrange

        //ac"

        String[] expectedValue = {"Ravali", "Sha","k"};

        //Act
        String[] actualValue = stringSort.sortString("Ravali Sha k");
        //Assert
        assertArrayEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

    }


}