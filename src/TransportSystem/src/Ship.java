package TransportSystem.src;



public class Ship extends Vehicle {
	private int numberOfCabins;
	private double deckSurface;
	
	public Ship (int a, String b, String c, String d, int f, double g )
	{
		super(a,b,c,d);
		setNumberOfCabins(f);
		setDeckSurface(g);
	}
	public int getNumberOfCabins() {
		return numberOfCabins;
	}
	public void setNumberOfCabins(int numberOfCabins) {
		this.numberOfCabins = numberOfCabins;
	}
	public double getDeckSurface() {
		return deckSurface;
	}
	public void setDeckSurface(double deckSurface) {
		this.deckSurface = deckSurface;
	}
	
}
