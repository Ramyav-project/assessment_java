package collectionprograms;
import java.util.ArrayList;
public class RemoveOperation {
public static void main(String[]args) {
 ArrayList<String>a1=new ArrayList<String>();
	a1.add("guava");
	a1.add("orange");
	a1.add("grapes");
	System.out.println("a1 is collection of"+a1);
	
	//remove(object 0)
	
	System.out.println(a1.remove("orange"));
	System.out.println("after performing remove"+a1);
	
	//remove(int index)
	a1.remove(0);
    System.out.println("after performing remove"+a1);
}
}
