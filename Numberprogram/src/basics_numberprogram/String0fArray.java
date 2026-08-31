package basics_numberprogram;
import java.util.Scanner;
public class String0fArray {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String[]names=new String[10];
	System.out.println("Enter 10 Strings:");
    for(int i=0;i<10;i++){
    names[i]=sc.nextLine();
    }
    System.out.println("\n The Entered Strings :");
    for(int i=0;i<10;i++) {
    System.out.println(names[i]);
    }
    
	}

}
