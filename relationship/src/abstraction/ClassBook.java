package abstraction;
//parent class
abstract public class ClassBook {
  int a=10;
  static String s="java";
  static double d;
  char c;
  //multi line static initializer
  static {
	  System.out.println("multi line static initailizer");
  }
  //multi line non static initializer
  {
	  System.out.println("multi line non static initializer");
  }
  //constructors
   ClassBook(char c)
  {
	  this.c=c;
  }
  public static void m1()
  {
	  System.out.println("from m1 static method");
  }
  public abstract void m2();
}
//child class
class EClassBook extends ClassBook
{
	EClassBook(char c)
	{
		super(c);
	}
	public void m2() {
		System.out.println("iam fraom m2 from child non static");
	}
}
class DriverClassBookEClassBook
{
	public static void main(String[] args) {
		EClassBook e=new EClassBook('p');
		System.out.println(e.a);
		System.out.println(ClassBook.s);
		System.out.println(ClassBook.d);
		System.out.println(e.c);
		ClassBook.m1();
		e.m2();
	System.out.println("----------------");
	ClassBook b=new EClassBook('c');
	System.out.println(b.a);
	System.out.println(ClassBook.s);
	System.out.println(ClassBook.d);
	System.out.println(b.c);
	}
}
	


		




