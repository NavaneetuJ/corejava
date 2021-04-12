
public class PlayMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r= PlayMethodReference::m1;
		Thread t= new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("im in main thread");
		}

	}

	public static void m1() {
		for(int i=0; i<10; i++) {
			System.out.println("im from m1 method");
		}
	}
}
