
public class FirstLamda {
	private static FirstLamda is;
	private static Object Isum;
	public static void main(String[] args) {
		Isum = (a , b) -> a+b;
		System.out.println(is.add(10,20));


		FuncInterface fi= () -> System.out.println("hello");


		fi.m1();
	}
	public static int squareIt(int n) {
		return n*n;
	}

	public static void m1() {
		System.out.println("hello");
		//	()->System.out.println(hello);

	}
	public static int add(int a, int b) {
		//( a,  b) ->  a+b;
		return a+b;

	}

}
