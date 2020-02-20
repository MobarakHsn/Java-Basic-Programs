public class Square
{
	public int length;
	public int result;
	
	public Square(int length)
	{
		this.length=length;
	}
	
	public void calculateAreaSquare()
	{
		System.out.println("Calculating area of Square.......");
		result=length*length;
	}
	
	public void showAreaOfSquare()
	{
		System.out.println("Area of the square is: "+result);
		System.out.println();
	}
}