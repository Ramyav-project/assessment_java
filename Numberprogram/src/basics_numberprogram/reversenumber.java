package basics_numberprogram;
import java.util.Scanner;
public class reversenumber {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the n value");
	int n=s.nextInt();//123
	int res=0;
	while(n>0) //123>0,12>0
	{
		int lastdigit=n%10; //123%10=3,12%10=2
		res=res*10+lastdigit; //0*10+3=3,3*10+2=32
	    n=n/10; //n=12
	}
     System.out.println("My res is:"+res);
	}

}
