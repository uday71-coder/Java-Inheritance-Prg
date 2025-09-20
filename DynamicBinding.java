package inheritancepack;
class A{
	public void show() {
		System.out.println("A.show()....");
	}
}

class B extends A{
	public void show() {
		System.out.println("B.show()....");
	}
}

class C extends B{
	public void show() {
		System.out.println("C.show().....");
	}
}
public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		
		C c=new C();
		A r;
		r=a;
		r.show();
		r=new B();
		r.show();
		r=c;
		r.show();
		

	}

}
