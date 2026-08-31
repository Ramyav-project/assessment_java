package daythree;
import java.util.Scanner;
public class count {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int a=s.nextInt();
	int count=0;
    while(a>0)
    {
     int ld=a%10;
     a=a/10;
     count++;
    }
	System.out.println("no of digit:"+count);

 }
}