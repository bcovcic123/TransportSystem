package TransportSystem.src;


public class Country extends Region{
	private String continent;
	private int population;
	
	public Country(String n, double s, String c, int p)
	{
		super(n,s);
		setContinent(c);
		setPopulation(p);
	}
	
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	

}
