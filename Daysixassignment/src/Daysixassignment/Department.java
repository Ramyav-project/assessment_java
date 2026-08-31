package Daysixassignment;

public class Department {
  //container class
	
	String dname;
	int did;
	Professional pro;
	
Department(String dname,int did)
{
	this.dname=dname;
	this.did=did;
}

  //creating helper method

	public void details(String pname,int pid)
{
	 pro = new Professional(pname,pid);
}
public void Departmentdetails()
{
	System.out.println("iam from department");
	System.out.println("dname from department:"+dname);
	System.out.println("did from department:"+did);
}
}
