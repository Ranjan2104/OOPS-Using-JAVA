public class Dog extends Animal {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.run();
	}
	void run() {
		System.out.println("I am Running");
	}
}
class Animal { // Parent Class/ Super class
	void eat() {
		System.out.println("I am Eating");
	}
}