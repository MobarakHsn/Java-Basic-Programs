//write a programme to convert string into lower case
import java.util.Scanner;
public class Convert_Upper_To_Lower
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=input.nextLine();
		s=s.toLowerCase();
		System.out.println(s);
	}
}