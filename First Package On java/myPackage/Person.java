package myPackage;
public class Person
{
	public String name;
	private int age;
	public String bloodGroup;
	
	public Person()
	{
		
	}
	
	public Person(int age)
	{
		this.age=age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setBloodGroup(String bloodGroup)
	{
		this.bloodGroup=bloodGroup;
	}
	
	public String getBloodGroup()
	{
		return bloodGroup;
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Blood group: "+bloodGroup);
	}
}