package TransportSystem.src;


public abstract class Vehicle {
	public int numberOfSeats;
	public String name;
	public String color;
	public String Id;
	
	
	
	public Vehicle(int n, String na, String c, String i)
	{
		setNumberOfSeats(n);
		setName(na);
		setColor(c);
		setId(i);
	}
	
	public String toString()
	{
		return getId()+" "+getName();
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}

}
