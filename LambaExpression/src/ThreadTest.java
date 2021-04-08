
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r= () ->{
			for(int i=0; i<5 ;i++) {
				System.out.println("main thread");
			}
		};

	}

}
