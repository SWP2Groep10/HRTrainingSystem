package logic;

public class Employee extends User {

	private int employeeID;

	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + "]";
	}
	
	public Employee(int userID, String username, String password, String role, Address address, String email,
			long phonenr, int employeeID) {
		super(userID, username, password, role, address, email, phonenr);
		this.employeeID = employeeID;
	}
	
	
}
