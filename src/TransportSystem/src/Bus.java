package TransportSystem.src;



public class Bus extends Vehicle {
	private double km;
	private int numberOfDoors;
	
	public Bus (int a, String b, String c, String d, double f, int g )
	{
		super(a,b,c,d);
		setKm(f);
		setNumberOfDoors(g);
	}
	
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
}
