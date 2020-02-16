import java.util.Scanner;
public class Compare_String
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter your first string: ");
		String s1=input.next();
		
		System.out.print("Enter your second string: ");
		String s2=input.next();
		
		int sz1=s1.length();
		int sz2=s2.length();
		
		
		System.out.println("................................");
		System.out.println("Compare by length: ");
		if(sz1==sz2)
		{
			System.out.println("Both string are equal.");
		}
		else if(sz1>sz2)
		{
			System.out.println("First string is greater");
		}
		else
			System.out.println("Second string in greater");
		System.out.println("................................");
		
		
		System.out.println("................................");
		System.out.println("Compare by substring: ");
		if(s1.equals(s2))
			System.out.println("The content of the two string is equal");
		else if(s1.contains(s2))
			System.out.println("Second string a sub string of the first one ");
		else if(s2.contains(s1))
			System.out.println("First one is a sub string of the second one");
		else
			System.out.println("Nothing matched");
		System.out.println("................................");
		
		
		
		System.out.println("................................");
		System.out.println("Compare lexicographically: ");
		int res=s1.compareTo(s2);
		if(res>0)
			System.out.println("First string is lexicographically larger than second one");
		else if(res<0)
			System.out.println("First string is lexicographically smaller than the second one");
		else
			System.out.println("They are equal");
		System.out.println("................................");
			
	}
}