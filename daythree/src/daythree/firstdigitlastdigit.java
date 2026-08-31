package daythree;
import java.util.Scanner;
public class firstdigitlastdigit {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=a.nextInt();
	int res=0;
	while(n>0)
     {
     int ld=n%10;
     res=res*10+ld;
     n=n/10;
     }
     int first=res%10;
     System.out.println(first);
     }
	}


