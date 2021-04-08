package defaultstatic;

public class FirstImpl implements SomeInterface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1 is firstimpl");

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

		System.out.println("method2 is firstimpl");
	}

	public void method3() {
		// TODO Auto-generated method stub
		//SomeInterface.super.method3();
		System.out.println("overridden firstimpl of method3 ");
	}

	void add() {}


}
