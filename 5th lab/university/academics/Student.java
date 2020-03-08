package university,academics;
public class Student{
	private int id;
	private String name;
	private double cgpa;
    
	public void setID(int i){	id=i;}
	public void setName(String n){	name=n;}
	public void setCGPA(double c){	cgpa=c;}
	
	public String getName(){return name;}
	public int getID(){return id;}
	public double getCGPA(){return cgpa;}
	
	public void print(){
        System.out.println("\nStudent details of : "+name);
		System.out.println("ID : "+id+", Name :"+name+" : cgpa : "+cgpa);
	}
	public String getDetails(){
		return "Name : "+name+" ID : "+id+", Name :"+cgpa;
	}
}