package main.java.com.stackroute.pe3;

public class ChessBoard {
    /*
     * This method creates a chess board and displays the result on the console
     */
    public String[][] createCheckBoardPattern(int rows, int cols) {
        {
            String output[][] = new String[rows][cols];

            /*Iterate the array to choose color*/
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (((i + j) % 2) == 0) {
                        output[i][j] = "WW";
                    } else {
                        output[i][j] = "BB";
                    }

                }
            }

            return output;
        }
    }
}
