package logic;

public class Manager extends User {

	private int managerID;

	public int getManagerID() {
		return managerID;
	}
	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}
	
	public Manager(int userID, String username, String password, String role, Address address, String email,
			long phonenr, int managerID) {
		super(userID, username, password, role, address, email, phonenr);
		this.managerID = managerID;
	}
}
