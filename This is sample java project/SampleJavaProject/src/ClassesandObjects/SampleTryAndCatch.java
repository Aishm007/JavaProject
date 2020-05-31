package ClassesandObjects;

public class SampleTryAndCatch {
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println("Hello world");
			int i=1/0;
			System.out.println("Completed");
		}
			catch(Exception exp){
				System.out.println("Exception caught, I am inside catch block");	
				System.out.println("Mesage is : " + exp.getMessage());
				System.out.println("Cause is: " + exp.getCause());
				exp.printStackTrace();
			}
		finally {
			System.out.println("I am in finally block, program completed.");
		}
	}

}
