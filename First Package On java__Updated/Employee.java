public class Employee
{
	private String phoneNo;
	private String email;
	
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo=phoneNo;
	}
	
	public String getPhoneNo()
	{
		return phoneNo;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void display()
	{
		System.out.println("Phone No: "+phoneNo);
		System.out.println("Email: "+email);
	}
}