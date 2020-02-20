public class Object_Equality
{
	public String name;
	public int age;
	public String bloodGroup;
	
	public Object_Equality(String Name,int age,String bloodGroup)
	{
		this.name=name;
		this.age=age;
		this.bloodGroup=bloodGroup;
	}
	
	boolean equals(Object_Equality o)
	{
		if(o.name==name && o.age==age && o.bloodGroup==bloodGroup)
			return true;
		else
			return false;
	}
}