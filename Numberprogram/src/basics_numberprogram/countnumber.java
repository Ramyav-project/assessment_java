package basics_numberprogram;
import java.util.Scanner;
public class countnumber {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the year");
	int year =s.nextInt();
	if(year%4==0&&year%100!=0)
	{
     System.out.println("it is leap year");
	}
	else
	{
		System.out.println("it is not a leap year");
	}
  }
}
