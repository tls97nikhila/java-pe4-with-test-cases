package com.stackroute.pe4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsNameTest {
    ContainsName containsName;
    @Before
    public void setUp(){
        containsName=new ContainsName();
    }
    @After
    public void tearDown(){
        containsName=null;
    }
    @Test
    public void testAStringReturnPresenceOfName(){
        String result = containsName.contains("This is Harry.","Harry");
        assertEquals("Is Harry here ? true", result);
    }
    @Test
    public void testAStringReturnPresenceOfNameFalse(){
        String result = containsName.contains("This is Harry.","carry");
        assertEquals("Is carry here ? false", result);
    }

    @Test(expected = NullPointerException.class)
    public void testAEmptyReturnInvalid(){
        String result = containsName.contains("This is Harry.",null);

    }

    @Test
    public void testASpaceReturnException(){
        String result = containsName.contains("This is Harry."," ");
        assertEquals("Invalid", result);
    }

    @Test
    public void testEmptyReturnException(){
        String result = containsName.contains("This is Harry.","");
        assertEquals("Invalid", result);
    }
}