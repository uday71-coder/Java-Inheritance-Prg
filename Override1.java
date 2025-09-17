package inheritanceprograms;

class SamsungMobile2024 {
	public String model = "2024";
	public String ram = "4 GB";
	public String storage = "256 GB";
	public double cost = 75000;

	@Override
	public String toString() {
		return "SamsungMobile2024 [model=" + model + ", ram=" + ram + ", storage=" + storage + ", cost=" + cost + "]";
	}
}

class SamsungMobile2025 extends SamsungMobile2024 {
	public String model = "2025";
	public String ram = "8 GB";

	public double cost = 95000;

	@Override
	public String toString() {
		return "SamsungMobile2025 [model=" + model + ", ram=" + ram + ", storage=" + storage + ", cost=" + super.cost
				+ "]";
	}

}

public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungMobile2024 s1 = new SamsungMobile2024();
		System.out.println(s1);
		SamsungMobile2025 s2 = new SamsungMobile2025();
		System.out.println(s2);

	}

}
