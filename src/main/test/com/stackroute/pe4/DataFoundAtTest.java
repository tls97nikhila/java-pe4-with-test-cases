package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

    public class DataFoundAtTest {
        DataFoundAt dataFoundAt;
        @Before
        public void setUp()
        {
            dataFoundAt=new DataFoundAt();
        }
        @After
        public void tearDown()
        {
            dataFoundAt =null;
        }
        @Test
        public void givenStringShouldResultWithCountOfGievnCharcters() {


            String result = dataFoundAt.find("She sells seashells by the seashore","se"); // positive test case

            assertEquals("Found at 4 to 6,Found at 10 to 12,Found at 27 to 29,", result);
        }

        @Test
        public void ifGivenStringIsNullShouldResultError() {


            String result = dataFoundAt.find(null,null); // null case invalid

            assertEquals("Invalid input", result);
        }

        @Test
        public void ifGivenStringIsEmptyShouldResultError() {


            String result = dataFoundAt.find(" "," ");  // empty case invalid

            assertEquals("Invalid input", result);
        }
    }
