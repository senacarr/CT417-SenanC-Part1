package assignment1.CT417_SenanC_Part1;

import java.util.ArrayList;
import assignment1.CT417_SenanC_Part1.Student;

public class Module {

	private String             name;
	private String             courseName;
	private String             id;
	private ArrayList<Student> students;
	
	public Module(String moduleName, String moduleCourseName)
	{
		this.name       = moduleName;
		this.courseName = moduleCourseName;
		this.id         = moduleCourseName.substring(0, 3) + moduleName.hashCode();
	}
	
	public void addStudents(ArrayList<Student> moduleStudents)
	{
		this.students = moduleStudents;
	}
	
	public String getModuleName()
	{
		return this.name;
	}
	
	public String getModuleCourseName()
	{
		return this.courseName;
	}
	
	public String getModuleID()
	{
		return this.id;
	}
	
	public ArrayList<Student> getStudents()
	{
		return this.students;
	}
	
	public void setModuleName(String moduleName)
	{
		this.name = moduleName;
		this.id   = this.courseName.substring(0, 3) + moduleName.hashCode();
	}
	
}








