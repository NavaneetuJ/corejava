package statics;

import defaultstatic.FirstImpl;

public class TestDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstImpl firstImpl = new FirstImpl();
		firstImpl.method3();
		System.out.println(IUtility.isEligible(18));

		OtherList otherList = new OtherList();
		otherList.append();

	}

}
