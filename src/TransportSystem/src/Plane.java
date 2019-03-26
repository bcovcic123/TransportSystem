package TransportSystem.src;


public class Plane extends Vehicle{
	private int numberOfMotors;
	private int numberOfPilotsSeats;
	
	public Plane (int a, String b, String c, String d, int f, int g )
	{
		super(a,b,c,d);
		setNumberOfMotors(f);
		setNumberOfPilotsSeats(g);
	}
	
	public int getNumberOfMotors() {
		return numberOfMotors;
	}
	public void setNumberOfMotors(int numberOfMotors) {
		this.numberOfMotors = numberOfMotors;
	}
	public int getNumberOfPilotsSeats() {
		return numberOfPilotsSeats;
	}
	public void setNumberOfPilotsSeats(int numberOfPilotsSeats) {
		this.numberOfPilotsSeats = numberOfPilotsSeats;
	}
	
	

}
