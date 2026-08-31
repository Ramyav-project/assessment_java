package day7assignment;

public class Exception {
  public static void main(String[] args) {
		String file=null;
		
		System.out.println("start");
		
		try {
			
			System.out.println("Exception:"+file.length());
			}
  catch(NullPointerException e) {
	   e.printStackTrace();
	
}
		System.out.println("End");
	}

}
