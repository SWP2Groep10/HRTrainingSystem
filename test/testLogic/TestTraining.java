package testLogic;


import logic.Address;
import logic.Email;
import logic.HRemployee;
import logic.Training;
import logic.User;
import logic.Location;
import logic.Survey;

import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.*;

public class TestTraining {
	
	Training t1, t2;
	Address a1,a2,a3,at4,at5,at6;
	Location l1,lt2;
	Email e1,e2 ,et3,et4;
	User u1,u2,ut3,ut4;
	Survey s1,st2;
	User[] users1,users2;
	
	@Before
	public void intialize () {
		a1 = new Address("Brussels","Belgium","Nieuwstraat",20,1000); 
		e1 = new Email ("etwas@ehb.be");
		a2 = new Address("New York","USA","4th Street",2,980080);
		e2 = new Email("imAnEmployee@ehb.be");
		a3 = new Address("Brussels","Belgium","NijverheidsKaai",3,1080);
		l1 = new Location(a3,"ErasmusHogeSchool");
		u1= new HRemployee(1,"Bijo","Bijo555","HREmployee",a1,e1,484556233,"E1");
		u2 = new HRemployee(2,"John","Lemonade","HREmployee",a2,e2,4849995,"E2");
		s1 = new Survey(123);
		users1 = new User[2];
		users1[0]=u1;
		users1[1]=u2;
		t1 = new Training(users1,l1,10,12,s1,120,Training.StatusType.ONGOING);
	}
	@Test 
	public void Training_Constructor_Test() {
		assertArrayEquals("Fout bij Training Constructor -> Attendinglist",users1,t1.getAttendinglist());
		assertEquals("Fout bij Training Constructor -> Location ",l1,t1.getLocation());
		assertEquals("Fout bij Training Constructor -> TrainingID",10,t1.getTrainingID());
		assertEquals("Fout bij Training Constructor -> LocationID",12,t1.getLocationID());
		assertEquals("Fout bij Training Constructor -> Survey ",s1,t1.getSurvey());
		assertEquals("Fout bij Training Constructor -> Duration",120,t1.getDuration());
		assertEquals("Fout bij Training Constructor -> Status",Training.StatusType.ONGOING,t1.getStatus());
		
	}
	@Test
	public void Training_Setters_Test() {
		at4= new Address("TestCity","TestCountry","TestStreet",0,0);
		at5= new Address("SecondTestCity","SecondTestCountry","SecondTestStreet",0,0);
		at6= new Address("ThirdTestCity","ThirdTestCity","ThirdTestCity",0,0);
		lt2= new Location(at6,"LocationTestName");
		et3= new Email("TestMail@Test.be");
		et4= new Email("SecondTestMail@Test.be");
		st2= new Survey(555);
		ut3= new HRemployee(0,"TestName","TestPass","TestRole",at4,et3,5555555,"TestID");
		ut4= new HRemployee(0,"SecondTestName","SecondTestPass","SecondTestRole",at5,et4,5555555,"SecondTestID");
		users2= new User[2];
		users2[0]=ut3;
		users2[1]=ut4;
		t2= new Training(users2,lt2,0,0,st2,0,Training.StatusType.EXPIRED);
		
		t2.setAttendinglist(users1);
		assertArrayEquals("Fout bij Setter -> Attendinglist",users1,t2.getAttendinglist());
		t2.setLocation(l1);
		assertEquals("Fout bij Setter -> Location",l1,t2.getLocation());
		t2.setLocationID(100);
		assertEquals("Fout bij Setter -> LocationID",100,t2.getLocationID());
		
		
	}
}
