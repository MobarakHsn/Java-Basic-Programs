public class Library
{
	public String name;
	public String address;
	static int  noOfBook;
	public int capacity;
	public Book b[]=new Book[100];
		
	public Library(String name,String address,int capacity)
	{
		this.name=name;
		this.address=address;
		this.capacity=capacity;
		noOfBook=0;
	}
	
	public void addBook(Book d)
	{
		for(int index=0;index<b.length; index++)
		{
			if(b[index]==null)
			{
				b[index]=d;
				int number=b[index].numberOfCopy;
				noOfBook+=(number);
				break;
			}
		}
	}
	
	public void showWholeLibrary()
	{
		System.out.println();
		System.out.println("Name of the Library: "+name);
		System.out.println("Location of the Library: "+address);
		System.out.println("Number  of books of the Library: "+noOfBook);
		System.out.println("Capacity of the Library: "+capacity);
		System.out.println();
		
		System.out.println("Showing all types of books info: ");
		for(int i=0 ; i<b.length ; i++)
		{
			if(b[i]!=null)
			{
				int nm=i+1;
				System.out.println();
				System.out.println("Details of Book number "+nm+" is: ");
				b[i].showBookInfo();
			}
		}
		
	}
	
}