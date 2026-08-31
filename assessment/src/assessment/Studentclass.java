package assessment;

public class Studentclass {
  //create a non static variable
	int id;
	String name;
	int age;
	String course;
	short marks;
	String collegename;
	
	//create a static variable
	static String college;
	static String student_count;
	
	//create a default constructor
	Studentclass()
	{
		
	}
	
	//create a parameterized constructor
	Studentclass(int id,String name,int age,String course,short marks,String collegename)
	{
	 this.id=id;
	 this.name=name;
	 this.age=age;
	 this.course=course;
	 this.marks=marks;
	 this.collegename=collegename;
	}
	
	//create a another constructor
	Studentclass(int id,String name)
	{
	this.id=id;
	this.name=name;
	}
	
	//create a non static method to display Studentdetails
	public void Studentclass()
	{
		 System.out.println(" id is:"+id);
	     System.out.println(" name is :"+name); 
	     System.out.println(" age is:"+age);
	     System.out.println(" course is:"+course); 
	     System.out.println(" marks is:"+marks);
	     System.out.println(" collegename is:"+collegename);
	}
	
	//create a static method to display Collegedetails
	public static void Collegedetails()
	{
		System.out.println("the college name is:"+college);
		System.out.println("total no of student is:"+student_count);
	}
}	
	     

		

	
	
	

