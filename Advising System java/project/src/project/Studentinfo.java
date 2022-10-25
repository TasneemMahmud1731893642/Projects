package project;


public class Studentinfo extends registration {
	String ID;

	public Studentinfo(String firstname, String secondname, String dob, String email, String phone) {
		super(firstname, secondname, dob, email, phone);
		this.ID="173457834298";
	}
	
	

	public String student() {
		System.out.println("Name: "+ this.getFirstname().concat(this.getSecondname()));
		System.out.println("Date of Birth: "+ this.getDob());
		System.out.println("Email Address: "+ this.getEmail());
		System.out.println("Phone Number: "+ this.getPhone());
		System.out.println("ID: "+ this.ID);
		return "";
	}
	

}
