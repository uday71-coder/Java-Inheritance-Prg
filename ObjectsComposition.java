package inheritancepack;

class Math5 {
	public void sum(int x, int y) {
		int z;
		z = x + y;
		System.out.println("Sum = " + z);
	}
}

class Math6 {
	Math m = new Math(); // Object Delegation

	public void sub(int x, int y) {
		System.out.println("SUb = " + (x - y));
	}
}

class Math7 {
	// Object Composition/Aggregation.
	Math5 m1 = new Math5();
	Math6 m2 = new Math6();

	public void add(int x, int y) {
		m1.sum(x, y);
	}

	public void sub(int x, int y) {
		m2.sub(x, y);
	}
}

public class ObjectsComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math7 m3 = new Math7();
		m3.add(69, 36);
		m3.sub(69, 49);

	}

}
