//File: GraduateStudent.java
//Programmer: Jennifer King
//Date: 09/24/2018

public class GraduateStudent extends Student 
{
	double t = 6000;
	
	public GraduateStudent(int id, String name)
	{
		super(id, name);
	}
	
	@Override
	public double setTuition()
	{
		tuition = 6000;
		return tuition;
	}
}
