package assignment1.CT417_SenanC_Part1;

import java.util.Calendar;

public class Student 
{
	private String   name;
	private Calendar dob;
	private int      age;
	private int      id;
	
    public Student(String studentName, Calendar studentDOB, int studentAge)
    {
    	this.name = studentName;
    	this.dob  = studentDOB;
    	this.id   = (studentName + System.currentTimeMillis()).hashCode();
    	this.age  = studentAge;
    }
    
    public String getStudentName()
    {
    	return this.name;
    }
    
    public Calendar getStudentDOB()
    {
    	return this.dob;	
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












