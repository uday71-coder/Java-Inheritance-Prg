package inheritancepack;

class Math {
	public void sum(int x, int y) {
		int z;
		z = x + y;
		System.out.println("Sum = " + z);
	}
}

class Math1 {
	Math m = new Math(); // Object Delegation

	public void add(int x, int y) {
		m.sum(x, y);
	}
}

public class ObjectDelegation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math1 m1 = new Math1();
		m1.add(256, 693);
		

	}

}
