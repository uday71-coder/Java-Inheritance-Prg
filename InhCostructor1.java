package inheritancepack;

class Employee {
	public String ename;
	public int empno;

	public Employee() { // o arguments/default constructor.
		ename = "No-Name";
		empno = 0;
	}
}

class Designation extends Employee {
	private String designation;
	private double salary;

	public Designation() {
		super(); // calls default constructor or super class constructor.
		designation = "No-Designation";
		salary = 0.0;
	}

	@Override
	public String toString() {
		return "Designation [designation=" + designation + ", salary=" + salary + ", ename=" + ename + ", empno="
				+ empno + "]";
	}

}

public class InhCostructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Designation d = new Designation();
		System.out.println(d);

	}

}
