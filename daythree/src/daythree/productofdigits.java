package daythree;

import java.util.Scanner;
public class productofdigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=s.nextInt();
		int product=1;
		while(a>0)
		{
			int ld=a%10;
			product=product+ld;
			a=a/10;
			}
		System.out.println("product of digit:"+product);

	}

}
