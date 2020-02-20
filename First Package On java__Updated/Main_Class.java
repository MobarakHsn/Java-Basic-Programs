//Main class for work with package 
import myPackage.Person;
import java.util.Scanner;
public class Main_Class
{
	public static void main(String arg[])
	{
		Person obj=new Person();
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String nm=input.nextLine();
		obj.setName(nm);
		
		System.out.print("Enter age: ");
		int ag=input.nextInt();
		obj.setAge(ag);
		
		String bd=input.nextLine();
		
		System.out.print("Enetr Blood Group: ");
		bd=input.nextLine();
		obj.setBloodGroup(bd);
		
		
		Employee obj1=new Employee();
		
		System.out.print("Enter the employee's phone number: ");
		bd=input.nextLine();
		obj1.setPhoneNo(bd);
		
		System.out.print("Enter the email address: ");
		bd=input.nextLine();
		obj1.setEmail(bd);
		
		System.out.println();
		obj.display();
		obj1.display();
		
	}
}