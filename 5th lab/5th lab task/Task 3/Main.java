import org.parent.*;
import org.child.*;
public class Main
{
	public static void main(String arg[])
	{
		Animal a=new Animal();
		Mammal m=new Mammal();
		Reptile r=new Reptile();
		Lion L=new Lion();
		
		L.isBipolar(false);
		System.out.println("Lion is bipolar: "+L.isBipolar());
		
		

	}
}