package relationship;
//parent
public class Animal {
   String type;
   private String color;
   int size;
}
   
//child
class Tiger extends Animal
{
	 int price;
	 String place;
}
//Driver
class DriverAnimalTiger
{
	public static void main(String[]args) {
		//specification
		Tiger t=new Tiger();
		System.out.println();
		System.out.println("Type from Parent:"+t.type);
		System.out.println("Type from Parent:"+t.size);
		System.out.println("-------------------");
		System.out.println("Type from Child:"+t.price);
		System.out.println("Type from Child:"+t.place);
	}	
}
	

