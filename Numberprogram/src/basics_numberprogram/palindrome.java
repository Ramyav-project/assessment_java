package basics_numberprogram;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=s.nextInt();//123
	int tem=a;
	int res=0;
	while(a>0)//123>0,12>0,1>0
	{
		int ld=a%10;//123%10=3,12%10=2
		res=res*10+ld;//0*10+3=3,13*10+2=32,32*10+1=321
		a=a/10;//n=12 quotient
	}
	System.out.println("My res is:"+res);
	if(tem==res) {
		System.out.println("it is a palindrome");
		}
	else
	{
		System.out.println("it is not palindrome");
	}
	}

}
