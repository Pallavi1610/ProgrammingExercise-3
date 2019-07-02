package main.java.com.stackroute.pe3;

public class ConsecutiveNumbers {
    boolean result = false;
    /*
     * this function checks if the numbers in the string are in consecutive order and returns a boolean value
     * to the caller function
     */
    public boolean checkConsecutive(String values) {
        String[] array = values.split(",");
        for (int i = 0; i < array.length - 1; i++) {

            //check the difference between the current number and previous number
            int difference = Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]);
            System.out.println(difference);

            //check if the difference equals to 1
            if (difference == 1 || difference == -1) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
