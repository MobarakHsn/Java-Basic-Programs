public class Rectangle
{
	public int height;
	public int width;
	public int result;
	
	public Rectangle(int height,int width)
	{
		this.height=height;
		this.width=width;
	}
	
	public void calculateAreaRectangle()
	{
		System.out.println("Calculating area of Rectangle.......");
		result=height*width;
	}
	
	public void showAreaOfRectangle()
	{
		System.out.println("Area of the Rectangle is: "+result);
		System.out.println();
	}
}