package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    Sort sort;
    @Before
    public void setUp(){
        sort=new Sort();
    }
    @After
    public void tearDown(){
        sort=null;
    }
    @Test
    public void testForStringReturnSortedArray(){
        String result[] = sort.sortPara("we have nothing but everything"); // positive test case
        String expect[]={"but","everything","have","nothing","we"};
        assertEquals(result,expect);
    }

    @Test
    public void testForEmptyReturnMessage(){
        String result[] = sort.sortPara("");
        String expect[]={"should not enter empty string"}; // empty input test case
        assertEquals(result,expect);
    }

    @Test (expected = NullPointerException.class)
    public void testForNullRetuenException(){
        String result[] = sort.sortPara(null); // null case as invalid
    }


    @Test
    public void testForNumStringReturnSortedArray(){
        String result[] = sort.sortPara("4 3 1"); // numericals
        String expect[]={"1","3","4"};
        assertEquals(result,expect);
    }
}