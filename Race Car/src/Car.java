
public class Car {
	private String color;
	private String make;
	private Tire[] tires;

	public Car(String color, String make, Tire[] tires) {
		super();
		this.color = color;
		this.make = make;
		this.tires = tires;
	}

	public boolean start() {

		boolean success=true;
		for(int i=0; i<tires.length; i++) {
			if (tires[i].getPressure()<32) {
				System.out.println("Tire #" + i + " is too low to start the car");
				success=false;
			}

		}
		return success;
	}



	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Tire[] getTires() {
		return tires;
	}
	public void setTires(Tire[] tires) {
		this.tires = tires;
	}


}
