package assignment1.CT417_SenanC_Part1;

import org.junit.Test;
import static org.junit.Assert.*;

import assignment1.CT417_SenanC_Part1.Student;
import java.util.GregorianCalendar;

public class StudentTest
{
	@Test
    public void getUsernameHappyPathTest() throws Exception
    {
		Student s1 = new Student("Senan", new GregorianCalendar(1994, 10, 22));
        assertTrue(s1.getStudentName() == "Senan");
    }
	
	@Test(expected=Exception.class)
    public void getUsernameInvalidNameExceptionTest() throws Exception
    {        
        new Student("", new GregorianCalendar(1994, 10, 22));
    }
	
	@Test(expected=Exception.class)
    public void getUsernameInvalidDateExceptionTest() throws Exception
    {        
        new Student("", new GregorianCalendar(10994, 10, 22));
    }
}
