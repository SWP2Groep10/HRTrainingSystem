package logic;

public class Location {

	private Address address;
	private String locationName;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	@Override
	public String toString() {
		return "Location [address=" + address + ", locationName=" + locationName + "]";
	}
	public Location(Address address, String locationName) {
		super();
		this.address = address;
		this.locationName = locationName;
	}
}