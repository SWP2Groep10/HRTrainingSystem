package testLogic;

import logic.Address;

import static org.junit.Assert.*;

import org.hamcrest.core.IsInstanceOf;
import org.junit.*;

public class TestAddress {

	Address a1,temp1,o;
	
	@Before
	public void initialize() {
		
		a1=new Address("brussel","België" , "teststraat", 123, 1030);
	}
	
	@Test
	public void Address_Constructor_Test() {
		
		assertEquals("Fout bij Address constructor->City","brussel",a1.getCity());
		assertEquals("Fout bij Address constructor->Country","België",a1.getCountry());
		assertEquals("Fout bij Address constructor->Street","teststraat",a1.getStreet());
		assertEquals("Fout bij Address constructor->Number",123,a1.getNumber());
		assertEquals("Fout bij Address constructor->Postalcode",1030,a1.getPostalcode());
	}
	
	
	@Test
	public void Address_Setters_test() {
		temp1=new Address("testcity","testland","teststreet",1,1000);
		temp1.setCity("Antwerpen");
		assertEquals("Fout bij Address setter->City","Antwerpen",temp1.getCity());
		temp1.setCountry("België");
		assertEquals("Fout bij Address setter->Country","België",temp1.getCountry());
		temp1.setStreet("Bredastraat");
		assertEquals("Fout bij Address setter->Street","Bredastraat",temp1.getStreet());
		temp1.setNumber(2);;
		assertEquals("Fout bij Address setter->Number",2,temp1.getNumber());
		temp1.setPostalcode(2060);
		assertEquals("Fout bij Address setter->Postalcode",2060,temp1.getPostalcode());
	}
	
	@Test
	public void Address_Datatype_Test() {
		o=new Address("blacity","blaland","blastraat",3,1040);
		assertTrue("Niet zelfde datatype bij Address->City","blacity"==o.getCity());
		assertTrue("Niet zelfde datatype bij Address->Country","blaland"==o.getCountry());
		assertTrue("Niet zelfde datatype bij Address->Street","blastraat"==o.getStreet());
		assertTrue("Niet zelfde datatype bij Address->Number",3==o.getNumber());
		assertTrue("Niet zelfde datatype bij Address->Postalcode",1040==o.getPostalcode());
		
		
	}
	
}
