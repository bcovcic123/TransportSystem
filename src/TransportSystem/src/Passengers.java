package TransportSystem.src;

import java.util.Date;

public class Passengers {
	
	private String name;
	private String passportId;
	private String sex;
	private Date birth;
	
	public Passengers(String n, String p, String s, Date b)
	{
		setName(n);
		setPassportId(p);
		setSex(s);
		setBirth(b);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassportId() {
		return passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public String toString()
	{
		return getName()+" "+getPassportId();
	}

}
