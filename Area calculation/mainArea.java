import java.util.Scanner;
public class mainArea
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Which option you want to choose: ");
			System.out.println("Enter 0 to get out of the system: ");
			System.out.println("Enter 1 to calculate area of Rectangle: ");
			System.out.println("Enter 2 to calculate area of Square: ");
			System.out.println("Enter 3 to calculate area of Circle: ");
			System.out.println();
			System.out.print("Now enter your desired option: ");
			int option=input.nextInt();
			if(option==0)
				break;
			
			else if(option==1)
			{
				System.out.print("Enter height of the Rectangle: ");
				int height=input.nextInt();
				System.out.print("Enter width of the Rectangle: ");
				int width=input.nextInt();
				Rectangle r1=new Rectangle(height,width);
				r1.calculateAreaRectangle();
				r1.showAreaOfRectangle();
			}
			
			else if(option==2)
			{
				System.out.print("Enter length of the Square: ");
				int length=input.nextInt();
				Square s1=new Square(length);
				s1.calculateAreaSquare();
				s1.showAreaOfSquare();
			}
			
			else if(option==3)
			{
				System.out.print("Enter radius of the Circle: ");
				double radius=input.nextDouble();
				Circle c1=new Circle(radius);
				c1.calculateAreaCircle();
				c1.showAreaOfCircle();
			}
			
		}

	}
}