package inhertance;

public class TestDefaultInheritance implements Left , Right {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDefaultInheritance tdi = new TestDefaultInheritance();
		tdi.m1();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
	}

}
