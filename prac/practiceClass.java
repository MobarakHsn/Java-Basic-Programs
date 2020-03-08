public class practiceClass
{
	public String name;
	public int h;
	
	public practiceClass()
	{
		this("Sabbir");
		System.out.println("This work first constructor");
	}
	
	public practiceClass(String name)
	{
		setName(name);
		System.out.println("This work second constructor");
		
	}
	
	public void setName(String n)
	{
		name=n;
	}
	
	public void showInfo(){
		System.out.println(name);
	}
}
