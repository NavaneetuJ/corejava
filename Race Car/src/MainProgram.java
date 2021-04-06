
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire t1=new Tire(0,"black",18,"ZigZag");
		Tire t2=new Tire(0,"red",18,"ZigZag");
		Tire t3=new Tire(0,"white",18,"ZigZag");
		Tire t4=new Tire(0,"pink",18,"ZigZag");
		
		t1.inflated(50);

		Tire[] tires= {t1,t2,t3,t4};

		Car supercar=new Car("Black","Ford",tires);

		boolean started=false;
		started=supercar.start();
		if(started==true) {
			System.out.println("the car is running!");
		}
		else {
			System.out.println("The car failed to start");
		}

	}

}
