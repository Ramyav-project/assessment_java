package basics_numberprogram;
import java.util.Scanner;
public class oddnumber {
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
		System.out.println("Enter the n integer value");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)
			{
			System.out.println(i);
			}

		}
	  }
	}	


	


