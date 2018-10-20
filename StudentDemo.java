//File: StudentDemo.java
//Progammer: Jennifer King
//Date: 09/24/2018

public class StudentDemo 
{
	public static void main(String[] args)
	{
		Student[] arr = new Student[6];
	
		arr[0] = new UndergraduateStudent(111, "Lambert");
		arr[1] = new UndergraduateStudent(122, "Lembeck");
		arr[2] = new GraduateStudent(233, "Miller");
		arr[3] = new GraduateStudent(256, "Marmon");
		arr[4] = new StudentAtLarge(312, "Nichols");
		arr[5] = new StudentAtLarge(376, "Nussbaum");
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i].setTuition();
			System.out.println("Student #" + arr[i].getID() + 
							  "\tName: " + arr[i].getName() + 
							  "\tTuition: $" + arr[i].getTuition() + "0 per year");
		}
	}
}
