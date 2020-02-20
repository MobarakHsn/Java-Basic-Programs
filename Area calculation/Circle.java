public class Circle
{
	public double radius;
	public double result;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	public void calculateAreaCircle()
	{
		System.out.println("Calculating area of Circle.......");
		result=Math.PI*radius*radius;
	}
	
	public void showAreaOfCircle()
	{
		System.out.println("Area of the Circle is: "+result);
		System.out.println();
	}
}