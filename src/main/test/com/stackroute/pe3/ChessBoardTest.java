package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.ChessBoard;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
ChessBoard chess;
    @Before
    public void setUp() throws Exception {
        chess=new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        chess=null;
    }
    @Test
    public void checkChessBoardResult()
    {
        String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

        String [][] result = chess.createCheckBoardPattern(8,8);

        assertNotEquals(expected,result);
    }
}