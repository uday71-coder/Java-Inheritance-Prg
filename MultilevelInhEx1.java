package inheritancepack;

class Employee2 {
	protected String ename;
	protected int empno;

	public Employee2(String ename, int empno) {
		this.ename = ename;
		this.empno = empno;
	}
}

class Designation2 extends Employee2 {
	protected String designation;
	protected double salary;

	public Designation2(String ename, int empno, String designation, double salary) {
		super(ename, empno);
		this.designation = designation;
		this.salary = salary;
	}

}

class Department2 extends Designation2 {
	private String deptname;
	private String location;

	public Department2(String ename, int empno, String designation, double salary, String deptname, String location) {
		super(ename, empno, designation, salary);
		this.deptname = deptname;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department2 [deptname=" + deptname + ", location=" + location + ", salary="+ salary + ", ename=" + ename + ", empno=" + empno
				+ "]";
	}

}

public class MultilevelInhEx1 {

	public static void main(String[] args) {
		Department2 d1 = new Department2("Harish", 563, "Developer", 95000, "Product base", "Hyderabad");
		System.out.println(d1);
	}

}
