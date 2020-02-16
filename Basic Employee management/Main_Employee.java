import java.util.Scanner;
public class Main_Employee
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		while(true)
		{
			System.out.println("Input any number to create new employee or 0 to exit.");
			int inptt=input.nextInt();
			if(inptt==0)
				break;
			
			Employee E1=new Employee();
			while(true)
			{
				System.out.println("Enter your option or press 0 to get out of the system");
				System.out.println("press 1 to see total number of employee");
				System.out.println("pres 2 to input name & id");
				System.out.println("pres 3 to input gender.");
				System.out.println("pres 4 to input age.");
				System.out.println("pres 5 to input phone number.");
				System.out.println("pres 6 to input Designation.");
				System.out.println("pres 7 to show all information of the employee.");
				int inp=input.nextInt();
				
				if(inp==0)
					break;
				
				if(inp==1)
				{
					int number=Employee.totalNumberOfEmployee;
					System.out.println(number);
				}
			
				if(inp==2)
				{
					String s=input.next();
					E1.name=s;
					int in=input.nextInt();
					E1.id=in;
					
				}
				
				
				if(inp==3)
				{
					String s=input.next();
					E1.gender=s;	
				}
				
				if(inp==4)
				{
					int i=input.nextInt();
					E1.setAge(i);
				}
				
				if(inp==5)
				{
					String s=input.next();
					E1.setPhoneNo(s);

				}
				
		
				if(inp==6)
				{
					String s=input.next();
					E1.designation=s;
				}
				
				if(inp==7)
				{
					E1.display();
				}
				
				
			}
		}
		
		
	}
}