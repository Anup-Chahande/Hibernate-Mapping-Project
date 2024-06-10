package Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty_Subjects {
	@Id
	int Subjectsid;
	String Subjectname;

	public String getSubjectname() {
		return Subjectname;
	}

	public void setSubjectname(String subjectname) {
		Subjectname = subjectname;
	}

	@Override
	public String toString() {
		return "Faculty_Subjects [Subjectsid=" + Subjectsid + ", Subjectname=" + Subjectname + "]";
	}

	public Faculty_Subjects(int subjectsid, String subjectname) {
		super();
		Subjectsid = subjectsid;
		Subjectname = subjectname;
	}

	public Faculty_Subjects() {
		super();
	}
}
