
public class Launch1 {

	public static void main(String[] args) {
		Cargoplane c=new Cargoplane();
		c.takeoff();
		c.fly();
		c.land();
		//creating an an object of abstract class indirectly
		Plane ref=new Plane()
     		{
		@Override
		void fly()
		{
		System.out.println("Plane flew");	
		}
	};
		ref.fly();
	}

}
