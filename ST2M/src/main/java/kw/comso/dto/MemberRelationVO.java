package kw.comso.dto;

public class MemberRelationVO {
	String email;
	String myTeacher;
	String myStudent;

	// setter
	public void setEmail(String email) {
		this.email = email;
	}

	public void setMyTeacher(String myTeacher) {
		this.myTeacher = myTeacher;
	}

	public void setMyStudent(String myStudent) {
		this.myStudent = myStudent;
	}

	// getter
	public String getEmail() {
		return this.email;
	}

	public String getMyTeacher() {
		return this.myTeacher;
	}

	public String getMyStudent() {
         return this.myStudent;
      }
}
