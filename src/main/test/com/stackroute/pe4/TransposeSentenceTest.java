package com.stackroute.pe4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

    public class TransposeSentenceTest {
        TransposeSentence transposeSentence;

        @Before
        public void setUp()
        {
            transposeSentence=new TransposeSentence();
        }

        @After
        public void tearDown()
        {
            transposeSentence=null;
        }
        @Test
        public void testGivenStringReturnTranspose()
        {
            String result=transposeSentence.reverseString("a quick brown fox jumps over the lazy dog");
            assertEquals(result,"a kciuq nworb xof spmuj revo eht yzal god");  // positive test case
        }
        @Test
        public void testGivenEmptyStirng()
        {
            String result=transposeSentence.reverseString("");
            assertEquals(result,"Empty strings not allowed");  // empty strings
        }
        @Test(expected = NullPointerException.class)
        public void testGivenNullShouldRaiseException()

        {
            String  result=transposeSentence.reverseString(null); // null as input
        }
    }