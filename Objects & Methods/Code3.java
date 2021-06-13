public class Employee {

	public static void main(String[] args) {
		Employee ep = new Employee("Amresh", 101);
		Employee ep2 = new Employee("Shayam", 102);
	}
	String name;
	int emp_id;
	public Employee(String name, int emp_id) {
		this.name = name;
		this.emp_id = emp_id;
	}
}