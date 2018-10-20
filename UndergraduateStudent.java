// File: UndergraduateStudent.java
// Programmer: Jennifer King
// Date: 09/24/2018

public class UndergraduateStudent extends Student 
{
	public UndergraduateStudent(int id, String name)
	{
		super(id, name);
	}
	
	@Override
	public double setTuition()
	{
		tuition = 4000;
		return tuition;
	}
}
