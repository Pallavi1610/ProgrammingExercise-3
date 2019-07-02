package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.RemoveVowels;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels object;

    @Before
    public void setUp() throws Exception {
         object= new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String[] expected = {"nd", "ntd Stts", "Grmny", "gypt", "czchslvk"};
        String[] str = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] actual = object.removeVowelsInAGivenWord(str);

        assertArrayEquals(expected, actual);
    }
}