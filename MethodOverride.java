package inheritanceprograms;

class Add {
	public void sum(int x, int y) {
		int z;
		z = x + y;
		System.out.println("super.Sum = " + z);
	}
}

class Sum extends Add {
	public void sum(int x, int y) {
		System.out.println("Sum = " + (x + y));
	}

	public void add(int x, int y) {
		sum(x, y);// calls Sum class method.
		super.sum(x, y);// calls Add class method.
	}
}

public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum ob = new Sum();
		ob.add(256, 6969);

	}

}
