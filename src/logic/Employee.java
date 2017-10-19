package logic;

public class Employee {
	private String firstName, lastName;
	private String employeeNumber;
	
	public Employee(String firstName, String lastName, String employeeNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
}
