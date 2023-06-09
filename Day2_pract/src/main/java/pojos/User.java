package pojos;

import java.sql.Date;

//id | first_name | last_name | email | password | dob | status | role
public class User {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date dob;
	private boolean vottingStatus;
	private String role;
	public User(int id, String firstName, String lastName, String email, String password, Date dob,
			boolean vottingStatus, String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.vottingStatus = vottingStatus;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isVottingStatus() {
		return vottingStatus;
	}
	public void setVottingStatus(boolean vottingStatus) {
		this.vottingStatus = vottingStatus;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", dob=" + dob + ", vottingStatus=" + vottingStatus + ", role=" + role
				+ "]";
	}


	
	
}
