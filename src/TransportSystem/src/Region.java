package TransportSystem.src;


public abstract class Region {
	private String name;
	private double surface;
	
	public Region()
	{
		
	}
	
	public Region(String n, double s)
	{
		setName(n);
		setSurface(s);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}

}
