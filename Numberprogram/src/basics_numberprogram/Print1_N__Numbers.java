package basics_numberprogram;
import java.util.Scanner;
public class Print1_N__Numbers {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the integer value");
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		System.out.println(i);
	}
	for(int i=1;i>=n;i--)
	{
		System.out.println(i);
	}
  }
}	


