public class Employee
{
	public String name;
	public int id;
	public String gender;
	private int age;
	private String phoneNo;
	public String designation;
	public static int totalNumberOfEmployee;
	
	
	public Employee()
	{
		totalNumberOfEmployee++;
	}
	
	public Employee(int age,String phoneNo)
	{
		this.age=age;
		this.phoneNo=phoneNo;
	}
	static int getTotalNumberOfEmployee()
	{
		return totalNumberOfEmployee;
	}
	
	void setAge(int age)
	{
		this.age=age;
	}
	int getAge()
	{
		return age;
	}
	void setPhoneNo(String phoneNo)
	{
		this.phoneNo=phoneNo;
	}
	String getPhoneNo(String phoneNo)
	{
		return phoneNo;
	}
	void display()
	{
		System.out.println();
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phoneNo);
		System.out.println("Desgnation: "+designation);
		System.out.println();
	}
}
