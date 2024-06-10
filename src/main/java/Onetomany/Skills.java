package Onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Skills { 
	@Id
	String Role;

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public Skills(String role) {
		super();
		Role = role;
	}

	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Skills [Role=" + Role + "]";
	}

}
