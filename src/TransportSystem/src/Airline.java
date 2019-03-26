package TransportSystem.src;



public class Airline extends Transportation {
	private String airport;
	private double durationOfFlight;
	
	public Airline(Vehicle vv, Region f, Region t, String tc,String a, double d)
	{
		super(vv,f,t,tc);
		setAirport(a);
		setDurationOfFlight(d);
	}
	
	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public double getDurationOfFlight() {
		return durationOfFlight;
	}
	public void setDurationOfFlight(double durationOfFlight) {
		this.durationOfFlight = durationOfFlight;
	}

}
