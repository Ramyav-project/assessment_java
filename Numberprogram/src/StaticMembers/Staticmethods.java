package StaticMembers;

public class Staticmethods {
  //Staticmethods
	public static void abc()
	{
		System.out.println("iam from abc");
	}
	public static void xyz(int a)
	{
		System.out.println("iam from xyz");
	}
	public static void main(String[] args) {
	abc();
	Staticmethods.xyz(20);
	}
}


