package inheritanceprograms;

class Employee1 {
	public String ename;
	public int empno;

	public Employee1(String ename, int empno) { 
		this.ename = ename;
		this.empno = empno;
	}
}

class Designation1 extends Employee1 {
	private String designation;
	private double salary;

	public Designation1(String ename, int empno, String designation, double salary) {
		super(ename, empno);
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Designation [designation=" + designation + ", salary=" + salary + ", ename=" + ename + ", empno="
				+ empno + "]";
	}

}

public class InhConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Designation1 d = new Designation1("Uday Sai", 502, "Manager", 75000);
		System.out.println(d);

	}

}
