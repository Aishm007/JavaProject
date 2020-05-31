package ClassesandObjects;

public class AccountHolder {
	
	String firstName;
	String LastName;
	int age;
	float accountBalance;
	boolean eligibleForCC;
	
	public void testEligibilityCC() {
		
		if(age>=25  && accountBalance>=20000) {
			
			eligibleForCC=true;
		}
	}
	

}
