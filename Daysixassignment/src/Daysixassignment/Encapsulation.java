package Daysixassignment;

public class Encapsulation {

	private String ename;
	private int eid;
	private int salary;
	private int availableleave;
	
	//getter ename
	public String getname()
	{
		return ename;
	}
	//setter ename
	public void setname(String ename)
	{
		this.ename=ename;
	}
	//getter salary
	public int getsalary()
	{
		return salary;
	}
	//setter salary
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	//getter leaveavailable
	public int availableleave()
	{
		return availableleave;
	}
	//setter leaveavailable
	public void availableleave(int availableleave)
	{
	 this.availableleave=availableleave;
	}
	//driver encapsulation
	public static void main(String[]args) {
		Encapsulation e=new Encapsulation();
		e.setname("akalya");
		System.out.println("ename is:"+e.getname());
		e.setsalary(60000);
		System.out.println("salry is:"+e.getsalary());
		e.availableleave(2);
		System.out.println("leaveavailable is:"+e.availableleave());
	}
}

	


