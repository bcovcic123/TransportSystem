package TransportSystem.src;

import java.util.ArrayList;

public class TravelAgency {
	private ArrayList<Transportation> routes;
	private ArrayList<arrangement> a;
	
	public TravelAgency()
	{
		routes=new ArrayList<Transportation>();
		a=new ArrayList<arrangement>();
	}
	
	public void addRoute(Transportation t)
	{
		routes.add(t);
	}
	
	public void addArr(arrangement ar)
	{
		a.add(ar);
	}
	
	public ArrayList<Transportation> getRoutes() {
		return routes;
	}
	public void setRoutes(ArrayList<Transportation> routes) {
		this.routes = routes;
	}
	public ArrayList<arrangement> getA() {
		return a;
	}
	public void setA(ArrayList<arrangement> a) {
		this.a = a;
	}
	
}
