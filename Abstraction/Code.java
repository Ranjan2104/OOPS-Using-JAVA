public class scotter extends Vehicle{
	
	public static void main(String[] args) {
		car c = new car();
		c.start();
		
		scotter s = new scotter();
		s.start();
	}

	@Override
	void start() {
		System.out.println();
	}
}
abstract class Vehicle {
	
	abstract void start();
}
class car extends Vehicle {

	@Override
	void start() {
		System.out.println();
		
	}
	
}