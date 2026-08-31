package object;

public class Managerdriver {

	public static void main(String[] args) {
		//object creation
		Manager m=new Manager();
		//access the properties and behaviours
		System.out.println("experience:"+m.experience);
		System.out.println("no :"+m.no);
	    System.out.println("-----------------");
        m.experience= "teamlead";
        m.no=19;
        System.out.println("experience:"+m.experience);
		System.out.println("no :"+m.no);
	    System.out.println("-----------------");
         m.displaywork();    
}
}