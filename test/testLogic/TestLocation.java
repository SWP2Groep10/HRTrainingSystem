package testLogic;

import logic.Location;
import logic.Address;
import static org.junit.Assert.*;
import org.junit.*;

public class TestLocation {
	Location l1, lTemp;
	Address a1;
	@Before
	public void initialize(){
		a1 = new Address("Brussels","Belgium","Nijverheidskaai",100,1000);
		l1 = new Location(a1,"Erasmushogeschool");
	}
	
	@Test
	public void Location_constructor_Test(){
		assertEquals("Fout bij Location constructor -> LocationName","Erasmushogeschool",l1.getLocationName());
	}
	
	@Test
	public void Location_Setters_Test() {
		lTemp = new Location(a1,"Test Location");
		lTemp.setLocationName("testloc");
		assertEquals("Fout bij Location setter -> Location","testloc",lTemp.getLocationName());
	}
}

//Extra testen zoals locatie mag niet leeg zijn etc.