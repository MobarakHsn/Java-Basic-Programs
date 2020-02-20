import java.util.Scanner;
public class mainVehicle
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String typeOfVehicle;
	    String name;
	    int noOfWheels;
	    int noOfDoors;
		
		System.out.print("Enter the type of the vehicle: ");
		typeOfVehicle=input.next();
		
		System.out.print("Enter the name of the vehicle: ");
		name=input.next();
		
		System.out.print("Enter the number of the wheel of the vehicle: ");
		noOfWheels=input.nextInt();
		
		System.out.print("Enter the number of doors of the vehicle: ");
		noOfDoors=input.nextInt();
		
		Vehicle obj=new Vehicle(typeOfVehicle,name,noOfWheels,noOfDoors);
		
		obj.showInfo();
	}
}