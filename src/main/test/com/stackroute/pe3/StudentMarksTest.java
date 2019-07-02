
import main.java.com.stackroute.pe3.StudentMarks;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
StudentMarks marks;
    @org.junit.Before
    public void setUp() throws Exception {
        marks=new StudentMarks();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        marks=null;
    }
    @Test
    public void checkTheStudentGradeSuccess() {
        String result = marks.checktheGrade(3,new int[]{20,30,40});
        assertEquals("All marks are correct",result);
    }
    @Test
    public void checkTheStudentGradeFailure() {
        String result = marks.checktheGrade(5,new int[]{-10,30,40,50,101});
        assertEquals("Error",result);
    }

}