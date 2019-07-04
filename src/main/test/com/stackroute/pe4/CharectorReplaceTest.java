package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharectorReplaceTest {
    CharectorReplace replacer;
    @Before
    public void setUp()
    {
        replacer=new CharectorReplace();
    }
    @After
    public void tearDown()

    {
        replacer=null;
    }
    @Test
    public void givenStringShouldReturnReplacedString()
    {
//        arrange
        String result=replacer.converter("devil dead");
//        assert
        assertEquals("fevit feaf",result);
    }
    @Test
    public void givenStringShouldReturnReplacedSameString()
    {
//        arrange
        String result=replacer.converter("laugh like no is seeing");
//        assert
        assertEquals("taugh tike no is seeing",result);
    }
    @Test
    public void givenNullShouldReturnNull()
    {
//        arrange
        String result=replacer.converter(null);
//        assert
        assertEquals("Null string",result);
    }
}
