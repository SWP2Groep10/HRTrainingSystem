package logic;

public abstract class User {
	private int userID;
	private String username, password, role;
	private Address address; 
	private Email email;
	private PhoneNR phonenr;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	public PhoneNR getPhonenr() {
		return phonenr;
	}
	public void setPhonenr(PhoneNR phonenr) {
		this.phonenr = phonenr;
	}
	
	
	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", address=" + address + ", email=" + email + ", phonenr=" + phonenr + "]";
	}
	
	public User(int userID, String username, String password, String role, Address address, Email email,
			PhoneNR phonenr) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.role = role;
		this.address = address;
		this.email = email;
		this.phonenr = phonenr;
	}
	
	
}
