import university.academics.*;
import university.admin.*;
import university.*;
public class Test{
    public static void main(String s[]){
        Student st=new Student();
        st.print();
        
		ProbationStudent st2=new ProbationStudent();
        st2.print();
	    
        Officer o=new Officer();
        o.print();
		
		Another a=new Another();
		
    }
}