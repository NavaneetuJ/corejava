
public class Tire {
	private int pressure;
	private String color;
	private int diameter;
	private String TreadType;


	public Tire(int pressure, String color, int diameter, String treadType) {
		super();
		this.pressure = pressure;
		this.color = color;
		this.diameter = diameter;
		TreadType = treadType;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public String getTreadType() {
		return TreadType;
	}
	public void setTreadType(String treadType) {
		TreadType = treadType;
	}
	
	
	public void inflated(int bypounds) {
		// TODO Auto-generated method stub
		this.pressure = bypounds;
	}

}
