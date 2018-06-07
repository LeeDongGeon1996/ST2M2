package kw.comso.dto;

import java.util.Calendar;

//이름. id(이메일) , pw, 권한, 생년월일, {{지역}},{{전화번호}})
<<<<<<< HEAD

public class MemberInfoVO {
   String name;
   String email;
   String password;
   Calendar birth;
   String address;
   String pNum;
   String auth;
   
   //setter
   
   public void setName(String name) {
      this.name = name;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public void setPassword(String password) {
      this.password = password;
   }
   public void setBirth(Calendar birth) {
      this.birth = birth;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public void setPNum(String pNum) {
      this.pNum = pNum;
   }
   public void setAuth(String auth) {
      this.auth = auth;
   }
   
   
   //getter
   public String getName() {
      return this.name;
   }
   public String getEmail() {
      return this.email;
   }
   public String getPassword() {
      return this.password;
   }
   public Calendar getBirth() {
      return this.birth;
   }
   public String getAddress() {
      return this.address;
   }
   public String getPNum() {
      return this.pNum;
   }
   public String getAuth() {
      return this.auth;
   }
}
=======
public class MemberInfoVO {

	private String name;
	private String email;
	private String password;
	private Calendar birth;
	private String address;
	private String pNum;
	private String auth;	//개인 , 학생, 선생님

	// setter

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBirth(Calendar birth) {
		this.birth = birth;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPNum(String pNum) {
		this.pNum = pNum;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	// getter
	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	public Calendar getBirth() {
		return this.birth;
	}

	public String getAddress() {
		return this.address;
	}

	public String getPNum() {
		return this.pNum;
	}

	public String getAuth() {
		return this.auth;
	}
}
>>>>>>> branch 'JMC_after_mongo' of https://github.com/LeeDongGeon1996/ST2M2.git
