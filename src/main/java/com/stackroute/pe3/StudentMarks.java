package main.java.com.stackroute.pe3;

public class StudentMarks
{

    /*
     * This method checks if the grades of each student are in
     * the range of 0 - 100 and throws exception otherwise
     */
    public static String checktheGrade(int numOfStudents, int[] stuGrades)
    {

        for (int i = 0; i < numOfStudents; i++)

            // checks if the marks are in the range 0 -100 else returns error

            if (stuGrades[i] < 0 || stuGrades[i] > 100)
            {
                return "Error";
            }

            return "All marks are correct";



    }
}
