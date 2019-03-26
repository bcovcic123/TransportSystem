package TransportSystem.src;


public class arrangement {
	private Passengers p;
	private Transportation t;
	
	public arrangement(Passengers pp, Transportation tt) {
		setP(pp);
		setT(tt);
	}

	public Passengers getP() {
		return p;
	}

	public void setP(Passengers p) {
		this.p = p;
	}

	public Transportation getT() {
		return t;
	}

	public void setT(Transportation t) {
		this.t = t;
	}
	

}
