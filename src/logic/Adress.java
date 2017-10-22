package logic;

public class Adress {
	private String city, country, street;
	private int number, postalcode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}
	
	public Adress(String city, String country, String street, int number, int postalcode) {
		super();
		this.city = city;
		this.country = country;
		this.street = street;
		this.number = number;
		this.postalcode = postalcode;
	}
	
	@Override
	public String toString() {
		return "Adress [city=" + city + ", country=" + country + ", street=" + street + ", number=" + number
				+ ", postalcode=" + postalcode + "]";
	}
	
	
}
