package statics;

public interface IUtility {

	public static boolean isEligible(int age) {
		return (age >= 18)? true : false;
	}

}
