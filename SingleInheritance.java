package inheritanceprograms;

class Student {
	private String name;
	private int rollno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}

class Marks extends Student {
	private int sub1, sub2;

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

}

public class SingleInheritance {

	public static void main(String[] args) {
		Marks ob = new Marks();
		ob.setName("Uday");
		ob.setRollno(502);
		ob.setSub1(95);
		ob.setSub2(99);
		System.out.println("Name = " + ob.getName() + "\nRoll No = " + ob.getRollno() + "\nSub1 = " + ob.getSub1()
				+ "\nSub2 = " + ob.getSub2());

	}

}
