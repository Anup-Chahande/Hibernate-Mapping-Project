package Car_accident;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	int cid;
	String cname;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aid")
	Accient ac;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Accient getAc() {
		return ac;
	}

	public void setAc(Accient ac) {
		this.ac = ac;
	}

	public Car(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + ", ac=" + ac + "]";
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
}
