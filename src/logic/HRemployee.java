package logic;

public class HRemployee {
	private String firstName, lastName;
	private String HRemployeeID;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getHRemployeeID() {
		return HRemployeeID;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setHRemployeeID(String HRemployeeID) {
		this.HRemployeeID = HRemployeeID;
	}


	@Override
	public String toString() {
		return "HRemployee [firstName=" + firstName + ", lastName=" + lastName + ", HRemployeeID=" + HRemployeeID + "]";
	}

	public HRemployee(String firstName, String lastName, String HRemployeeID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.HRemployeeID = HRemployeeID;
	}

}
