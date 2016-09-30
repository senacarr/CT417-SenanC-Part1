package assignment1.CT417_SenanC_Part1;

import java.util.ArrayList;
import assignment1.CT417_SenanC_Part1.Module;
import org.joda.time.*;

public class CourseProgramme {

	private String            courseName;
	private ArrayList<Module> modules;
	private DateTime          startDate;
	private DateTime          endDate;
	
	public CourseProgramme(String programmeCourseName, 
			ArrayList<Module> programmeModules, 
			DateTime programmeStartDate, 
			DateTime programmeEndDate)
	{
		this.courseName = programmeCourseName;
		this.modules    = programmeModules;
		this.startDate  = programmeStartDate;
		this.endDate    = programmeEndDate;  
	}
	
	public String getCourseName()
	{
		return this.courseName;
	}
	
	public ArrayList<Module> getModules()
	{
		return this.modules;
	}
	
	public DateTime getStartDate()
	{
		return this.startDate;
	}
	
	public DateTime getEndDate()
	{
		return this.endDate;
	}
	
	public void setCourseName(String name)
	{
		this.courseName = name;
	}
	
	public void addModules(Module module)
	{
		this.modules.add(module);
	}
	
	public boolean removeModules(Module module)
	{
		return this.modules.remove(module);
	}
	
}








