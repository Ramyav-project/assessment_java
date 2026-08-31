package basics_numberprogram;
import java .util.Scanner;
public class Evenandodd {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	int evencount=0;
	int oddcount=0;
	while(n>0){
		int Id=n%10;
		if(Id%2==0) {
			evencount++;
			
		}
	    n=n/10;
	}
	System.out.println("Even digits:"+ evencount);
	System.out.println("odd digits:"+ oddcount);
    }
}


