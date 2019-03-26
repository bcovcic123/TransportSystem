package TransportSystem.src;


public class Road extends Transportation {
	private int numberOfStation;
	private double distance;
	
	public Road(Vehicle vv, Region f, Region t, String tc,String a, double d, int n, double dd)
	{
		super(vv,f,t,tc);
		setNumberOfStation(n);
		setDistance(dd);
	}
	public int getNumberOfStation() {
		return numberOfStation;
	}
	public void setNumberOfStation(int numberOfStation) {
		this.numberOfStation = numberOfStation;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}

}
