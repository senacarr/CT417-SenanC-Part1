package assignment1.CT417_SenanC_Part1;

import org.junit.Test;
import static org.junit.Assert.*;

import assignment1.CT417_SenanC_Part1.Student;
import java.util.Calendar;

public class StudentTest
{
	@Test
    public void getUsernameTest()
    {
    	Calendar c = Calendar.getInstance();
    	c.set(1994, 11, 22);
    	Student s1 = new Student("Senan", c, 21);
    	
    	
        assertTrue(s1.getStudentName() == "Senan");
    }
}
