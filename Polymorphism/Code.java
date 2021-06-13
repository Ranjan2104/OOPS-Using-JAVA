public class Student { // Method Overloading
	
	public static void main(String[] args) {
		Student s = new Student();
		s.show(2);
	}
	void show() {
		System.out.println("1");
	}
	void show(int a) {
		System.out.println("2");
	}
	void show(String a) {
		System.out.println("String1");
	}
}
