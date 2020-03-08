public class Book
{
	public String typeOfBook;
	public int regNo;
	public String bookName;
	public String writerName;
	public int numberOfCopy;
	
	public Book()
	{
		typeOfBook="No type";
		regNo=-1;
		bookName="no name";
		writerName="no writer";
		numberOfCopy=-1;
	}
	
	
	public Book(String typeOfBook,int regNo,String bookName,String writerName,int numberOfCopy)
	{
		this.typeOfBook=typeOfBook;
		this.regNo=regNo;
		this.bookName=bookName;
		this.writerName=writerName;
		this.numberOfCopy=numberOfCopy;
	}
	
	public void setTypeOfBook(String typeOfBook)
	{
		this.typeOfBook=typeOfBook;
	}
	
	public void setRegNo(int regNo)
	{
		this.regNo=regNo;
	}
	
	public void setBookName(String bookName)
	{
		this.bookName=bookName;
	}
	
	public void setWriterName(String writerName)
	{
		this.writerName=writerName;
	}
	
	public void setNumberOfCopy(int numberOfCopy)
	{
		this.numberOfCopy=numberOfCopy;
	}
	
	public void showBookInfo()
	{
		System.out.println("Name of the book is: "+bookName);
		System.out.println("Type of the book is: "+typeOfBook);
		System.out.println("Writer of the book is: "+writerName);
		System.out.println("Number of the book is: "+numberOfCopy);
		System.out.println("Registration number of the book is: "+regNo);
		System.out.println();
		
	}
	
}