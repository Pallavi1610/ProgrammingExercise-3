package main.java.com.stackroute.pe3;

public class ExceptionTypes {
    //method for NegativeArraySizeException
    public String arrayCreation(){
        String stringNegativeSize = null;
        try {
            int arr[] = new int[-2];

        }
        catch (NegativeArraySizeException n){
            stringNegativeSize=n.getClass().toString();
        }
        finally {
            System.out.println("running array creation finally");
        }
        return stringNegativeSize;
    }
    //method for ArrayIndexOutOfBoundException
    public String arrayAccess(){
        String stringIndex = null;
        try {
            int array[] = new int[10];
            int a = array[11];
        }
        catch (ArrayIndexOutOfBoundsException a){
            stringIndex = a.getClass().toString();
        }
        finally{
            System.out.println("running array access finally");
        }
        return stringIndex;
    }

    //method for NullPointerException

    public String stringAccess(){
        String string = null;
        String stringNull = null;
        try{
            char a = string.charAt(0);
        }
        catch (NullPointerException n){
            stringNull = n.getClass().toString();
        }
        finally {
            System.out.println("running string access finally");
        }
        return stringNull;
    }
}
