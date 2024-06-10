package Car_accident;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accient {
	@Id
	int aid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAplace() {
		return aplace;
	}
	public void setAplace(String aplace) {
		this.aplace = aplace;
	}
	@Override
	public String toString() {
		return "Accient [aid=" + aid + ", aplace=" + aplace + "]";
	}
	public Accient(int aid, String aplace) {
		super();
		this.aid = aid;
		this.aplace = aplace;
	}
	public Accient() {
		super();
		// TODO Auto-generated constructor stub
	}
	String aplace;

}
