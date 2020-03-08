package myPackage.Person;
public class Person
{
	public String name;
	public int age;
	public String bloodGroup;
	
	public Person()
	{
		this("no name",0,"no group");
		System.out.println("\nNo para constructor for person\n");
		
	}
	
	
	
	public Person(String name,int age,String bloodGroup)
	{
		this.name=name;
		this.age=age;
		this.bloodGroup=bloodGroup;
		System.out.println("\nPara for constructor person\n");
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getBloodGroup()
	{
		return bloodGroup;
	}
	
	
	public void show()
	{
		System.out.println();
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Blood group is: "+bloodGroup);
		System.out.println();
	}
}