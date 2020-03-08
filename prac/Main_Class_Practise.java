import java.util.Scanner;
import java.util.Arrays;
public class Main_Class_Practise
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		char arr[]=new char[10];
		for(int i=0;i<9;i++)
		{
			char a=input.next().charAt(0);
			arr[i]=a;
		}
		Arrays.sort(arr);
		String s=new String(arr);
		for(int i=0;i<9;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(s);
	}
}