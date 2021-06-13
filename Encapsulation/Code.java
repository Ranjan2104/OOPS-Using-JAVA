public class Company { 
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmp_id(10);
		System.out.println(e.getEmpid());
	}
}
class Employee {
	private int emp_id;
	public void setEmp_id(int eid) {
		emp_id = eid;
	}
	public int getEmpid() {
		return  emp_id;
	}
}