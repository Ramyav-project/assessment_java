package assessment;

public class Studentclassdriver {
   public static void main(String[]args) {
	   //0bject1
	 Studentclass s1= new Studentclass(1,"kanikha",20,"CSE",(short)98,"MECW");
	 Studentclass.Collegedetails();
	 s1.Studentclass();
	 System.out.println("------------------");
	 
	 //object2
	 Studentclass s2=new  Studentclass(2,"Ramya");
	 Studentclass.Collegedetails();
	s2.Studentclass();
     System.out.println("-------------------");
	}

}
