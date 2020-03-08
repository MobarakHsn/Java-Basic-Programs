public class Lecturer extends Employee
{
	private int salary;
	
	public Lecturer()
	{
		this(0);
		System.out.println("\nLecturer constructor with no para\n");
	}
	public Lecturer(String name,int age,String bd,String phoneNo,String email,int salary)
	{
		super(name,age,bd,phoneNo,email);
		this.salary=salary;
		System.out.println("\nLecturer constructor with person ,Employee, Lecturer\n");
	}
	
	public Lecturer(int salary)
	{
		this.salary=salary;
		System.out.println("\nLecturer constructor with para\n");
	}
	
	public void show()
	{
		System.out.println();
		System.out.println("Name is: "+getName());
		System.out.println("Age is: "+getAge());
		System.out.println("Blood group is: "+getBloodGroup());
		System.out.println("Phone number is: "+getPhoneNo());
		System.out.println("Email address is: "+getEmail());
		System.out.println("Salary is: "+salary);
		System.out.println();
		
	}
}