package project;

public class registration {
	private String firstname;
	private String secondname;
	private String dob;
	private String Email;
	private String Phone;
	private String password;
	public registration(String firstname, String secondname, String dob, String email, String phone) {
		super();
		this.firstname = firstname;
		this.secondname = secondname;
		this.dob = dob;
		this.Email = email;
		this.Phone = phone;
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
