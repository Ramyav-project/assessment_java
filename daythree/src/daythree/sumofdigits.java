package daythree;
import java.util.Scanner;
public class sumofdigits {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value");
	int a=s.nextInt();
	int sum=0;
	while(a>0)
	{
		int ld=a%10;
		sum=sum+ld;
		a=a/10;
		}
	System.out.println(sum);
}
}