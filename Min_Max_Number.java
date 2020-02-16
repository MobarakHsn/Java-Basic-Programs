//This program takes user input and input numbers in array and find smallest and biggest number
import java.util.Scanner;
public class Min_Max_Number
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int siz=input.nextInt();
		
		int[] number=new int[siz];
		
		System.out.println("Enter your inputs: ");
		for(int i=0; i<siz ;i++)
		{
			number[i]=input.nextInt();
			
		}
		int minNumber=number[0];
		int maxNumber=number[0];
		
		for(int i=0; i<siz ;i++)
		{
			if(maxNumber<number[i])
				maxNumber=number[i];
			
			if(minNumber>number[i])
				minNumber=number[i];
			
		}
		
		System.out.println("The maximum number in the array is: "+maxNumber+"\nThe minimum number in the array is: "+minNumber);
	}
}