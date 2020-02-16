//Program to find if two strings are Anagram or not
import java.util.Scanner;
public class Anagram
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s1=input.nextLine();
		
		System.out.print("Enter the second string: ");
		String s2=input.nextLine();
		
			
			int arr1[]=new int[26];
			int arr2[]=new int[26];
			
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			char[] s3=s1.toCharArray();
			char[] s4=s2.toCharArray();
			
			
			for(int i=0;i<s1.length();i++)
			{
				if(s3[i]==' ')
				{
					
				}
				else
				{
					int x=s3[i]-'a';
					arr1[x]++;
				}
			}
				
			for(int i=0;i<s2.length();i++)
			{				
				if(s4[i]==' ')
				{
					
				}
				else
				{
					int x=s4[i]-'a';
					arr2[x]++;
				}
			}

			int flag=0;
			for(int i=0;i<26;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("They are anagram");
			else
				System.out.println("They are not anagram");
			
			
	}
}
