package collectionprograms; 
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
 a.add(10);
 a.add(20);
 a.add(30);
System.out.println(a);
//remov(int index)
a.remove(2);
System.out.println(a);

//remove(object o)
a.remove(20);
System.out.println(a);
	}
	}


