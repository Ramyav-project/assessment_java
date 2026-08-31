package collectionprograms;
import java.util.LinkedList;
import java.util.ArrayList;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedList<Integer>l=new LinkedList<Integer>();
    l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	System.out.println(l);
	

 LinkedList<String>b=new LinkedList<String>(); 
  b.add("guava");
  b.add("kiwi");
  b.add("mango");
  System.out.println(b);
  
  ArrayList<String>c=new ArrayList<String>(); 
  c.add("kanikha");
  c.add("akalya");
  c.add("mekala");
  System.out.println(c);
  
  c.addAll(b);
  System.out.println(c);
  c.add(1,"mango");
  c.addAll(2,b);
  System.out.println(c);
	}
}
  

