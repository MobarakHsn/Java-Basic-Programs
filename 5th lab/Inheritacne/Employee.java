public class Employee extends Person
{
	protected String phoneNo;
	protected String email;
	
	public  Employee()
	{
		this("no phone number","no email");
		System.out.println("\nEmployee constructor with no para\n");
	}
	
	public Employee(String name,int age,String bd,String phoneNo,String email)
	{
		super(name,age,bd);
		this.phoneNo=phoneNo;
		this.email=email;
		
		System.out.println("\nEmployee constructor with person & employee\n");
	}
	
	public Employee(String phoneNo,String email)
	{
		this.phoneNo=phoneNo;
		this.email=email;
		
		System.out.println("\nEmployee constructor with only employee para\n");
	}
	
	protected String getPhoneNo()
	{
		return phoneNo;
	}
	
	protected String getEmail()
	{
		return email;
	}
	
	
	public void show()
	{
		System.out.println();
		System.out.println("Name is: "+getName());
		System.out.println("Age is: "+getAge());
		System.out.println("Blood group is: "+getBloodGroup());
		System.out.println("Phone number is: "+phoneNo);
		System.out.println("Email address is: "+email);
		System.out.println();
	}
}