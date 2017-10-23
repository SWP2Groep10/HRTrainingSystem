package testLogic;
import logic.Book;

import static org.junit.Assert.*;
import org.junit.*;

public class TestBook {
	Book b1, bTemp;
	
	
	@Before
	public void initialize() {
		b1 = new Book("William Heinemann: London", 1995, "9780434003 488", "Douglas Adams", "The Hitch Hiker's Guide to the Galaxy", 59.99);
	}
	
	@Test
	public void Book_Constructor_Test() {
		assertEquals("Fout bij Book constructor -> Author","Douglas Adams",b1.getAuthor());
		assertEquals("Fout bij Book constructor -> Cost",59.99,b1.getCost(), 0.001);
		assertEquals("Fout bij Book constructor -> ISBN","9780434003 488",b1.getIsbnID());
		assertEquals("Fout bij Book constructor -> Publisher","William Heinemann: London",b1.getPublisher());
		assertEquals("Fout bij Book constructor -> Title","The Hitch Hiker's Guide to the Galaxy",b1.getTitle());
		assertEquals("Fout bij Book constructor -> Year",1995,b1.getYear());
	}
	
	@Test
	public void Book_Setters_Test() {
		bTemp = new Book("Test Publisher", 1598, "Test ISBN", "Test Author", "Test Title", 99.99);
		bTemp.setAuthor("Dmitry Glukhovsky");
		assertEquals("Fout bij Book setter -> Author","Dmitry Glukhovsky",bTemp.getAuthor());
		bTemp.setCost(19.99);
		assertEquals("Fout bij Book setter -> Cost",19.99,bTemp.getCost(), 0.001);
		bTemp.setIsbnID("978-0-575-08624-1");
		assertEquals("Fout bij Book setter -> ISBN","978-0-575-08624-1",bTemp.getIsbnID());
		bTemp.setPublisher("Gollancz London");
		assertEquals("Fout bij Book setter -> Publisher","Gollancz London",bTemp.getPublisher());
		bTemp.setTitle("Metro 2033");
		assertEquals("Fout bij Book setter -> Title","Metro 2033",bTemp.getTitle());
		bTemp.setYear(2010);
		assertEquals("Fout bij Book setter -> Year",2010,bTemp.getYear());
	}
}
