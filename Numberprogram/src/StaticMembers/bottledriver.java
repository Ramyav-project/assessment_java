package StaticMembers;

public class bottledriver {

	public static void main(String[] args) {
		//object creation
				bottle l=new bottle();
				//access the properties and behaviour
				System.out.println("color is:"+l.color);
				System.out.println("color is:"+l.price);
				System.out.println("color is:"+l.brand);
				System.out.println("------------------");
				l.color="blue";
				l.price=200;
				l.brand="sterly";
				System.out.println("color is:"+l.color);
				System.out.println("color is:"+l.price);
				System.out.println("color is:"+l.brand);
				System.out.println("------------------");
				l.drinking();
				l.storage();

	}

}
