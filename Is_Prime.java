//program to find if a number is prime
import java.lang.Math;
import java.util.Scanner;
public class Is_Prime
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the intput: ");
		double number=input.nextDouble();
		double stp= Math.sqrt(number); 
		int n=(int)(stp);
		int fag=0;
		int nmbr=(int)(number);
		for(int i=2;i<=n;i++)
		{
			if(nmbr%2==0)
			{
				fag=1;
				break;
			}
		}
		if(fag==0)
			System.out.println("The number is prime.");
		else
			System.out.println("The number is not prime.");
		
	}
}