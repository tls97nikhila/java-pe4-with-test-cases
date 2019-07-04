package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class  OccurancesTest {
   Occurances count;
    @Before
    public void setUp()
    {
        count=new Occurances();
    }
    @After
    public void tearDown()
    {
        count=null;
    }
    @Test
    public void givenStringAndCharacterShouldReturnCharacterCount()
    {
//        arrange
        String result=count.counter("java again and again","a");
//        assert
        assertEquals("Character frequency is 7",result); // positive test case
    }
    @Test
    public void givenEmptyStringShouldReturnMessage()
    {
//        arrange
        String result=count.counter("","i");
//        assert
        assertEquals("Empty string",result); // emptyt string
    }
    @Test
    public void givenNullStringShouldReturnMessage()
    {
        String result=count.counter(null,"p");
        assertEquals("Null String",result); // null input test case
    }
    @Test
    public void givenStringAndCharacterNotInStringShouldReturnMessage()
    {
        String result=count.counter("Noway","b");
        assertEquals("Character doesnot exists",result);  // does not exits test case
    }

}
