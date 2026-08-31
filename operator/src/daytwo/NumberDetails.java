package daytwo;
import java.util.Scanner;
public class NumberDetails {
   public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the value:");
    int a=s.nextInt();
    if(a>=0)
    {
    	System.out.println("it is positive value");
    }
    else
    {
    	System.out.println("it is negative value");
    }
	if(a%2==0)
	{
		System.out.println("it is even number");
	}
	else
	{
		System.out.println("it is odd number");
	}
	
  }  
}

