package StaticMembers;

public class Multiinitializer {
//Multiline nonstatic initializer
	{
		System.out.println("add 1");
	}
	{
		System.out.println("add 2");
	}
	{
		System.out.println("add 3");
	}
	public static void main(String[] args) {
		Multiinitializer s=new Multiinitializer();
        System.out.println("abc");
	    Multiinitializer s1=new Multiinitializer();
        System.out.println("abc");
	}
}
