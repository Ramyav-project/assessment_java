package day7assignment;
//parent class
 abstract public class Animal {
int a=10;
static String s="elephant";
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
 Animal(char c)
{
	  this.c=c;
}
 
  public abstract void m1();


  public abstract void m2();
}
//child class
class elephant extends Animal
{
	elephant(char c)
	{
		super(c);
	}
//
public void m1()
	{
		System.out.println("i like elephant");
	}
	public void m2() {
		System.out.println("it is the largest animal");
	}

class DriverClassAnimalElephant
{
	public static void main(String[] args) {
		elephant e=new elephant('p');
		System.out.println(e.a);
		System.out.println(elephant.s);
		System.out.println(elephant.d);
		System.out.println(e.c);
		e.m2();
		
	System.out.println("----------------");
	elephant b=new elephant('c');
	System.out.println(b.a);
	System.out.println(elephant.s);
	System.out.println(elephant.d);
	System.out.println(b.c);
	}
}
	


	}


