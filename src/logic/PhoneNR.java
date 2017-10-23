package logic;

public class PhoneNR {
	private String phoneNR;
	
	public boolean validateNR(){

	String regex = "^([+]?\\d{1,4}[-\\s]?|)\\d{3}[-\\s]?\\d{3}[-\\s]?\\d{4}$";

        if (phoneNR.matches(regex)) {     
            return true;
        } else {     
            return false;
        }
	}
}
