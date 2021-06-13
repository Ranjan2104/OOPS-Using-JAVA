public class Student extends test { // Method Overriding
	
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
	}
	void show() {
		System.out.println("student show");
	}
}
class test {
	void show() {
		System.out.println("test show");
	}
}