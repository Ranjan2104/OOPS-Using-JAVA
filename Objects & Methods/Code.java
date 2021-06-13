public class Animal {

	public static void main(String[] args) {
		System.out.println("1");
		Animal buzo = new Animal();
		buzo.eat();
		buzo.run();
		
		Birds sparrow = new Birds(); // object
		sparrow.Fly();
	}
	public void eat() { // metods
		System.out.println(("I am Eating"));
	}
	public void run() {
		System.out.println("I am Running");
	}
}
class Birds {
	public void Fly() {
		System.out.println("I am Flying");
	}
}