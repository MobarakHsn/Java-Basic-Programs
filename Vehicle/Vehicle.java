public class Vehicle
{
	public String typeOfVehicle;
	public String name;
	public int noOfWheels;
	public int noOfDoors;
		
	public Vehicle()
	{
		
	}
	
	public Vehicle(String typeOfVehicle,String name, int noOfWheels,int noOfDoors)
	{
		this.typeOfVehicle=typeOfVehicle;
		this.name=name;
		this.noOfWheels=noOfWheels;
		this.noOfDoors=noOfDoors;
	}
	
	public void showInfo()
	{
		System.out.println("Type of the vehicle: "+typeOfVehicle);
		System.out.println("Name of the vehicle: "+name);
		System.out.println("Number of wheels of the vehicle: "+noOfWheels);
		System.out.println("Number of doors of the vehicle: "+noOfDoors);
	}
}