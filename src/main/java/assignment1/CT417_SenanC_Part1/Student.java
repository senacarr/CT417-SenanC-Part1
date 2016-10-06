package assignment1.CT417_SenanC_Part1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student 
{
	private String   name;
	private Calendar dob;
	private int      age;
	private int      id;
	    
    public Student(String studentName, Calendar studentDOB) throws Exception
    {
    	if(studentName.length() <= 0)
    	{
    		throw new Exception("Invalid Name");
    	}
    	
    	if(studentDOB.after(new GregorianCalendar()))
    	{
    		throw new Exception("Invalid Date");
    	}
   		
    	this.name = studentName;
    	this.dob  = studentDOB;
    	this.id   = Math.abs((studentName + System.currentTimeMillis()).hashCode());
    	this.age  = (int) ((new GregorianCalendar().getTimeInMillis() - studentDOB.getTimeInMillis()) / (1000*60.0*60*24*7*52));
    }
    
    public String getStudentName()
    {
    	return this.name;
    }
    
    public Date getStudentDOB()
    {
    	return this.dob.getTime();	
    }
    
    public int getStudentAge()
    {
    	return this.age;
    }
    
    public int getStudentID()
    {
    	return this.id;
    }
    
    public String getUsername()
    {
    	return this.name + this.age;
    }
    
    public void setStudentName(String studentName)
    {
    	this.name = studentName;
    }
    
    public void setStudentDOB(Calendar studentDOB)
    {
    	this.dob = studentDOB;
    	this.age = (int)(System.currentTimeMillis() - studentDOB.get(Calendar.MILLISECOND)) / (1000*60*60*24*7*52);
    }
    
    public int setStudentID(int studentID)
    {
    	return this.id = studentID;
    }
       
    
}












