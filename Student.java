//File: Student.java
//Programmer: Jennifer King
//Date: 09/24/2018

public abstract class Student 
{
	private int ID;
	private String name;
	protected double tuition;
	
	public Student(int num, String n)
	{
		ID = num;
		name = n;
	}
	
	public int getID() {return ID;}
	public void setID(int ID) {this.ID = ID;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public double getTuition() {return tuition;}
	public abstract double setTuition();
}
