package logic;

import java.util.regex.*;

public class PhoneNR {
	private String phonenr;
	
	public boolean validateNR(String number){

	String pattern = "^([+]?\\d{1,4}[-\\s]?|)\\d{3}[-\\s]?\\d{3}[-\\s]?\\d{4}$";

        if (number.matches(pattern)) {     
            return true;
        } else {     
            return false;
        }
	}
}
