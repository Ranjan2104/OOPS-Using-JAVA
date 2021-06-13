package proj1;
/**
	for object Inilizations we have three methods.
	(1) by reference variable.
	(2) by methods.
	(3) by constructor.
 */

// (1) by reference variable.
public class Animal {

	public static void main(String[] args) {
		Animal buzo = new Animal();
		buzo.Color = "Black";
		buzo.age = 10;
		System.out.println(buzo.Color + " " + buzo.age);
	}
	String Color;
	int age;
}

// by methods.
public class Animal {

	public static void main(String[] args) {
		Animal buzo = new Animal();
		buzo.initobj("black",10);
		buzo.print();
	}
	String Color;
	int age;
	void initobj(String c, int a) {
		color = c;
		age = a;
	}
	void print() {
		System.out.println(buzo.Color + " " + buzo.age);
	}
}
