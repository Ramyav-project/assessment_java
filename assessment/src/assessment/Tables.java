package assessment;

public class Tables {
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
	this.price=price;
  }
   public void setbrand(String brand)
  {
	this.brand=brand;
  }
  public void setsize(int size)
  {
	this.size=size;
  }
  class Tabledriver{
	  public static void main(String[]args) {
		  	 Tables t=new Tables();
		   System.out.println(t.getcolor());
		   System.out.println(t.getprice()); 
	       System.out.println(t.getbrand());
	       System.out.println(t.getsize()); 
	   t.setcolor("brown");
	   t.setprice(7500);
	   t.setbrand("ats");
	   t.setsize(4);
	   System.out.println("color is:"+t.getcolor());
	   System.out.println("price is:"+t.getprice());
	   System.out.println("brand is:"+t.getbrand());
	   System.out.println("size is:"+t.getsize());
	  }
	  
  }
  }
