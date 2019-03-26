package TransportSystem.src;


public abstract class Transportation {
	private Vehicle v;
	private Region from, to;
	private String transportCompany;
	
	public Transportation()
	{
		
	}
	
	public Transportation(Vehicle vv, Region f, Region t, String tc)
	{
		setV(vv);
		setFrom(f);
		setTo(t);
		setTransportCompany(tc);
	}
	
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v = v;
	}
	public Region getFrom() {
		return from;
	}
	public void setFrom(Region from) {
		this.from = from;
	}
	public Region getTo() {
		return to;
	}
	public void setTo(Region to) {
		this.to = to;
	}
	public String getTransportCompany() {
		return transportCompany;
	}
	public void setTransportCompany(String transportCompany) {
		this.transportCompany = transportCompany;
	}
	

}
