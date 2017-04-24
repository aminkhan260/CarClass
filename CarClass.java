
public class CarClass {
	private String make;
	private String color;
	private double engineSize;
	private int horsePower;
	private static int count = 0;

	/**
	 * 
	 * 
	 */
	public CarClass() {
		make = "Honda";
		color = "Black";
		engineSize = 3.5;
		horsePower = 400;
		count++;

	}

	/**
	 * 
	 * 
	 */

	public CarClass(String make, String color, double engineSize, int horsePower) {
		this.make = make;
		this.color = color;
		this.engineSize = engineSize;
		this.horsePower = horsePower;
		count++;
	}

	/**
	 * 
	 */

	public String getmake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public static int getCount() {
		return count;
	}

	/**public double move (double speed, int time) 
		double distance =0;
		distance = speed * time;
		return distance;
		 * 
		 * 
		 */
		
	public String toString() {
		return "Name: "+this.make+"\ncolor: "+this.color+"\nengineSize= "+ this.engineSize + "\nhorsePower= " + this.horsePower;
	}

}
