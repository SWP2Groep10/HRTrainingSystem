package logic;

public class Admin extends User {
private int adminID;

public int getAdminID() {
	return adminID;
}
public void setAdminID(int adminID) {
	this.adminID = adminID;
}

public Admin(int userID, String username, String password, String role, Address address, Email email, long phonenr,
		int adminID) {
	super(userID, username, password, role, address, email, phonenr);
	this.adminID = adminID;
}

}
