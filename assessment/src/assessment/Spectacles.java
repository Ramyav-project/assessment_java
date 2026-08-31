package assessment;

public class Spectacles {
   private String color;
   private int price;
   private String brand;
   private int size;
    
   //getter
   public String getcolor()
   {
	   return color;
   }
   public int getprice()
   {
	   return price;
   }
   public String getbrand()
   {
	   return brand;
   }
   public int getsize()
   {
	   return size;
   }
   
   //setter
   public void setcolor(String color)
   {
	   this.color=color;
   }
   public void setprice(int price)
   {
	  this. price=price;
   }
   public void setbrand(String brand)
   {
	   this.brand=brand;
   }
   public void setsize(int size)
   {
	   this.size=size;
   }
   
   //Driverspectacle
   class Spectacledriver{
	   public static void main(String[]args)
	   {
		 Spectacles s=new Spectacles();
		   System.out.println(s.getcolor());
		   System.out.println(s.getprice()); 
	       System.out.println(s.getbrand());
	       System.out.println(s.getsize()); 
	   s.setcolor("white");
	   s.setprice(2500);
	   s.setbrand("lenskart");
	   s.setsize(12);
	   System.out.println("color is:"+s.getcolor());
	   System.out.println("price is:"+s.getprice());
	   System.out.println("brand is:"+s.getbrand());
	   System.out.println("size is:"+s.getsize());
	   } 
	}

}
