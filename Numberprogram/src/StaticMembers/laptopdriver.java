package StaticMembers;

public class laptopdriver {

	public static void main(String[] args) {
	//object creation
		laptop l=new laptop();
		//access the properties and behaviour
		System.out.println("color is:"+l.color);
		System.out.println("color is:"+l.price);
		System.out.println("color is:"+l.brand);
		System.out.println("------------------");
		l.color="blue";
		l.price=60000;
		l.brand="lenovo";
		System.out.println("color is:"+l.color);
		System.out.println("color is:"+l.price);
		System.out.println("color is:"+l.brand);
		System.out.println("------------------");
		l.gaming();
		l.watchvideos();
	}

}
