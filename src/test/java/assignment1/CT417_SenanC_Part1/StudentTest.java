package assignment1.CT417_SenanC_Part1;

import org.junit.Test;
import static org.junit.Assert.*;

import assignment1.CT417_SenanC_Part1.Student;
import java.util.GregorianCalendar;

public class StudentTest
{
	@Test
    public void getUsernameTest()
    {
		Student s1 = new Student("Senan", new GregorianCalendar(1994, 10, 1994));
    	
    	
        assertTrue(s1.getStudentName() == "Senan");
    }
}
