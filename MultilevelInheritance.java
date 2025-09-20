package inheritancepack;

class Student1 {
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

class Marks1 extends Student1 {
	protected int sub1, sub2;

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

class Result extends Marks1 {
	private int total;
	private double avg;

	public int getTotal() {
		return total;
	}

	public void calculateTotal() {
		total = sub1 + sub2;
	}

	public void calculateAvg() {
		avg = total / 2;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Result ob = new Result();
		ob.setName("Uday");
		ob.setRollno(502);
		ob.setSub1(95);
		ob.setSub2(99);
		ob.calculateTotal();
		ob.calculateAvg();
		System.out.println("Name = " + ob.getName() + "\nRoll No = " + ob.getRollno() + "\nSub1 = " + ob.getSub1()
				+ "\nSub2 = " + ob.getSub2() + "\nTotal = " + ob.getTotal() + "\nAverage = " + ob.getAvg());

	}

}
