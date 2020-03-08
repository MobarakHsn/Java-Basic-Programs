public class Person
{
	protected String name;
	protected int age;
	protected String bloodGroup;
	
	protected Person()
	{
		this("no name",0,"no group");
		System.out.println("\nNo para constructor for person\n");
		
	}
	
	
	
	protected Person(String name,int age,String bloodGroup)
	{
		this.name=name;
		this.age=age;
		this.bloodGroup=bloodGroup;
		System.out.println("\nPara for constructor person\n");
	}
	
	protected String getName()
	{
		return name;
	}
	
	protected int getAge()
	{
		return age;
	}
	
	protected String getBloodGroup()
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