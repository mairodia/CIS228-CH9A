//File: StudentAtLarge.java
//Programmer: Jennifer King
//Date: 09/24/2018

public class StudentAtLarge extends Student 
{
	double t = 2000;
	
	public StudentAtLarge(int id, String name)
	{
		super(id, name);
	}
	
	@Override
	public double setTuition()
	{
		tuition = 2000;
		return tuition;
	}
}
