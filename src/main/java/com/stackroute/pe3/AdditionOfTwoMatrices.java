package main.java.com.stackroute.pe3;

public class AdditionOfTwoMatrices {
    /*
     * This method takes two matrices as input and returns a matrix which is the sum
     * of the two matrices
     */
    public int[][] calculateSum(int rows, int columns,int[][] matrix1,int[][] matrix2)
    {
        //initializing an array with the length of given array
        int sum[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;



    }
}


