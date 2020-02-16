//program to find if a string is palindrome or not

import java.util.Scanner;
public class Palindrome
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Ente the string: ");
		String s1=input.nextLine();
		int len=s1.length();
		char[] s2=s1.toCharArray();
		char[] s3=new char[len];
		int j=0;
		for(int i=len-1;i>=0;i--)
		{
			s3[j++]=s2[i];
		}
		
		int fag=0;
		for(int i=0;i<len;i++)
		{
			if(s2[i] != s3[i])
			{
				fag=1;
				break;
			}
		}
		
		if(fag==0)
			System.out.println("It is palindrome.");
		else
			System.out.println("It is not palindrome.");
	}
}