import java.util.Scanner;
public class Main_Library
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		
		Library L=new Library("Aiub Library","Aiub campus,kuri",500);
		
		while(true)
		{
			System.out.println();
			System.out.print("Enter 0 to exit or Enter any other number to store book information: ");
			int option=input.nextInt();
			if(option == 0)
				break;
			else
			{
				Book a=new Book();
				
				System.out.println();
				System.out.print("Enter the type of the Book: ");
				String s=input.next();
				a.setTypeOfBook(s);
				
				System.out.print("Enter the name of the Book: ");
				s=input.next();
				a.setBookName(s);
				
				System.out.print("Enter the name of the writer: ");
				s=input.next();
				a.setWriterName(s);
				
				System.out.print("Enter the registration number of the book: ");
				int n=input.nextInt();
				a.setRegNo(n);
				
				System.out.print("Enter the number of copy of the book: ");
				n=input.nextInt();
				a.setNumberOfCopy(n);
				
				L.addBook(a);
				
			}
		}
		
		L.showWholeLibrary();
	}
}