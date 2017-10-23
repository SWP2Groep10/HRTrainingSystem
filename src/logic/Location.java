package logic;

public class Location {

	private Address address;
	private String locationName;
	private int latitude, longitude;
	
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
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	
	@Override
	public String toString() {
		return "Location [address=" + address + ", locationName=" + locationName + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}
	public Location(Address address, String locationName, int latitude, int longitude) {
		super();
		this.address = address;
		this.locationName = locationName;
		this.latitude = latitude;
		this.longitude = longitude;
	}
}