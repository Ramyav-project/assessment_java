package basics_numberprogram;
import java.util.Scanner;
public class Largestoftwonumber {

	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter a  number");
	   int n=s.nextInt();
	   System.out.println(n);
	   System.out.println("Enter n number");
	   int a=s.nextInt();
	   System.out.println(a);
	   if(n<a)
	   {
		   System.out.println("n is the largest number:"+n);
	   }
	   else
	   {
		   System.out.println("a is the largest number:"+a);
	   }
	}

}
