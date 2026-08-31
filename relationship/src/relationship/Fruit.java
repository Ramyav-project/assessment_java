package relationship;

public class Fruit {
  String taste;
  String color;
}

class Apple extends Fruit
{
	int price;
}

 class DriverFruitApple
{
	 public static void main(String[]args) {
	   Fruit f1=new Apple();
	   Apple a=(Apple)f1;
	   System.out.println("taste from parent:"+a.taste);
       System.out.println("color from parent:"+a.color);
       System.out.println("----------------------");
       System.out.println("Price from child:"+a.price);
	 }
}