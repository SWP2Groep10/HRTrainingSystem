package logic;

public class HRemployee extends User {
	private String HRemployeeID;

	
	public String getHRemployeeID() {
		return HRemployeeID;
	}
	public void setHRemployeeID(String hRemployeeID) {
		HRemployeeID = hRemployeeID;
	}

	public HRemployee(int userID, String username, String password, String role, Address address, Email email,
			long phonenr, String hRemployeeID) {
		super(userID, username, password, role, address, email, phonenr);
		HRemployeeID = hRemployeeID;
	}
	
}
