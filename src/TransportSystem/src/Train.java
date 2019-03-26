package TransportSystem.src;



public class Train extends Vehicle{
	private int numberOfVagons;
	private double voltage;
	
	public Train (int numberOfSeats, String name, String color, String Id, int numberofVagons, double voltage )
	{
		super(numberOfSeats,name,color,Id);
		setNumberOfVagons(numberofVagons);
		setVoltage(voltage);
	}
	
	public int getNumberOfVagons() {
		return numberOfVagons;
	}
	public void setNumberOfVagons(int numberOfVagons) {
		this.numberOfVagons = numberOfVagons;
	}
	public double getVoltage() {
		return voltage;
	}
	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	
	public String toStrig() {
		return "Train [numberofseats =" + numberOfSeats + "name =" + name + "color = " + color + "Id =" + Id + "numVagons = " + numberOfVagons + "voltage =" + voltage + "]";
	}
	}

