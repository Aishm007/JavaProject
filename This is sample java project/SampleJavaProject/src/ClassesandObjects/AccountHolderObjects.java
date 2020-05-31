package ClassesandObjects;

public class AccountHolderObjects {
	
	public static void main(String[] args) {
		
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		/* Details for Tom */
		
		tom.firstName="tom";
		tom.LastName="smith";
		tom.age=21;
		tom.accountBalance=10000;
		tom.testEligibilityCC();
		
		System.out.println("Is tom elgible for credit card :" +tom.eligibleForCC);
		
		/* Details for Henry */
		
		henry.firstName="henry";
		henry.LastName="hill";
		henry.age=31;
		henry.accountBalance=20000;
		henry.testEligibilityCC();
		
		System.out.println("Is henry elgible for credit card :" +henry.eligibleForCC);
		
		
		/* Details for Sarah */
		
		sarah.firstName="sarah";
		sarah.LastName="white";
		sarah.age=41;
		sarah.accountBalance=30000;
		sarah.testEligibilityCC();
		
		System.out.println("Is sarah elgible for credit card :" +sarah.eligibleForCC);
		
	}

}
