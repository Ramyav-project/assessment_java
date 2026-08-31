package interfaceexample;

public interface College {
	public static final String collegename="MECW";
	int a = 20;  
	public abstract void m1();
}
class student implements College
{
	public void m1()
	{
		System.out.println("iam from child m1");
	}
	}
class DriverCollegestudent
{
	public static void main(String[]args) {
		College c=new student();
		System.out.println(College.collegename);
		System.out.println(College.a);
		c.m1();
	}
}
