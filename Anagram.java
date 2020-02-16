//Simple program to find if two string is angram or not.
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
		
		if(s1.length()!=s2.length())
			System.out.println("They are not anagram");
		
		else
		{
			
			int arr1[]=new int[26];
			int arr2[]=new int[26];
			
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			char[] s3=s1.toCharArray();
			char[] s4=s2.toCharArray();
			
			int countSpaceFirst=0,countSpaceSecond=0;
			
			for(int i=0;i<s1.length();i++)
			{
				if(s3[i]==' ')
					countSpaceFirst++;
				else
				{
					int x=s3[i]-'a';
					arr1[x]++;
				}
				
				
				if(s4[i]==' ')
					countSpaceSecond++;
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
			if(flag==0 && countSpaceFirst==countSpaceSecond)
				System.out.println("They are anagram");
			else
				System.out.println("They are not anagram");
			
			
			}
			
	}
}