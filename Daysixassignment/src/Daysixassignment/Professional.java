package Daysixassignment;

public class Professional {
//dependent class
	String pname;
	int pid;
	
	
Professional(String pname,int pid)
{
	this.pname=pname;
	this.pid=pid;
}
public void professionaldetails()
{
	System.out.println("iam professional");
	System.out.println("pname from professional:"+pname);
    System.out.println("pid from professional:"+pid);
}
}