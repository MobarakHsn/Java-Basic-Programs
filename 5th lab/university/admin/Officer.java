package university.admin;
public class Officer{
	private int id;
	private String name;
	public void setID(int i){	id=i;}
	public void setName(String n){	name=n;}
	
	public String getName(){return name;}
	public int getID(){return id;}
	
	public void print(){
        System.out.println("\nOfficer details of "+name);
		System.out.println("ID : "+id+", Name :"+name);
	}
	public String getDetails(){
		return "Name : "+name+" ID : "+id;
	}
}