package collection;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =5,result =1;
		for(int i=input;i>=1;i--) {
			result = result * i;
		}
		System.out.println("Factorial of " + input+ " is: "+ result);

	}

}
