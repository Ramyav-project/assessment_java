package StaticMembers;

public class nonstaticmethods {
//non static methods
	public void a()
	{
		System.out.println("iam a");
	}
	public int b(int b)
	{
		System.out.println("iam b");
		return b;
	}
	public static void main(String[] args) {
	nonstaticmethods n=new nonstaticmethods();
      n.a();
      n.b(123);
	}

}
