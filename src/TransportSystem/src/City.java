package TransportSystem.src;


public class City extends Region{
	private String country;
	private Boolean capital;
	
	public City(String n, double s, String c, Boolean p)
	{
		super(n,s);
		setCountry(c);
		setCapital(p);
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Boolean getCapital() {
		return capital;
	}
	public void setCapital(Boolean capital) {
		this.capital = capital;
	}

}
