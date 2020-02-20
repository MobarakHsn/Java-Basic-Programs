public class Equality_Main
{
	public static void main(String args[])
	{
		Object_Equality a=new Object_Equality("Mobarok",18,"B+");
		Object_Equality b=new Object_Equality("Mobarok",18,"B+");
		
		if(a.equals(b))
			System.out.println("Oh yeah!");
		else
			System.out.println("No no");
	}
}