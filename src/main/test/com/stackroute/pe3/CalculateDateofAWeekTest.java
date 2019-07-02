package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.CalculateDateofAWeek;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateDateofAWeekTest {
    CalculateDateofAWeek date;

    @Before
    public void setUp() throws Exception {
        date=new CalculateDateofAWeek();
    }

    @After
    public void tearDown() throws Exception {
        date=null;
    }
    @Test
    public void checkStartDateofWeek()
    {
        String result=date.calculateFirstAndLastdateOfTheWeek();
        assertEquals("Mon 01/07/2019Sun 07/07/2019",result);
    }

}