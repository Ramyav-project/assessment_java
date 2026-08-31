package relationship;

public class Vegetables {

}
class Potato extends Vegetables
{
	
	
}
class Tomato extends Vegetables
{
	
}
class Driver
{
	public static void main(String[]args) {
		Vegetables v = new Potato();
		
		if(v instanceof Potato)
		{
			Potato p=(Potato)v;
			System.out.println("Downcasted successfully for Potato");
		}
		else
		{
			Tomato t = (Tomato)v;
			System.out.println("Downcasted successfully for Tomato");
		}
	}
}
