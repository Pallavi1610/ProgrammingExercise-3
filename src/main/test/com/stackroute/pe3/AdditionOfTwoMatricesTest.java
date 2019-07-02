package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.AdditionOfTwoMatrices;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfTwoMatricesTest {
    AdditionOfTwoMatrices matrix;

    @Before
    public void setUp() throws Exception {
        matrix = new AdditionOfTwoMatrices();
    }

    @After
    public void tearDown() throws Exception {
        matrix = null;
    }

    @Test
    public void givenTwoMatricesShouldReturnMatrixsum() {
        int[][] result = matrix.calculateSum(3,2,new int[][]{{1, 2}, {3, 4}, {5, 6}}, new int[][]{{9, 8}, {7, 6}, {5, 4}});
        assertArrayEquals(new int[][]{{10, 10}, {10, 10}, {10, 10}}, result);
    }
}