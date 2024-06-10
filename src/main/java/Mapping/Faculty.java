package Mapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Faculty {
	@Id
	int Facultyid;
	String Facultyname;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Facultyid")
	List<Faculty_Subjects> fs;

	public Faculty(int facultyid, String facultyname, List<Faculty_Subjects> fs) {
		super();
		Facultyid = facultyid;
		Facultyname = facultyname;
		this.fs = fs;
	}

	public int getFacultyid() {
		return Facultyid;
	}

	public void setFacultyid(int facultyid) {
		Facultyid = facultyid;
	}

	public String getFacultyname() {
		return Facultyname;
	}

	public void setFacultyname(String facultyname) {
		Facultyname = facultyname;
	}

	public List<Faculty_Subjects> getFs() {
		return fs;
	}

	public void setFs(List<Faculty_Subjects> fs) {
		this.fs = fs;
	}

	public Faculty() {
		super();
	}

	@Override
	public String toString() {
		return "Faculty [Facultyid=" + Facultyid + ", Facultyname=" + Facultyname + "]";
	}

	public Faculty(int facultyid, String facultyname) {
		super();
		Facultyid = facultyid;
		Facultyname = facultyname;
	}
}
