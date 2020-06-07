package demo;

import java.io.IOException;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void demo()throws Exception{
		
			System.out.println("I am handling exceptions");
			//throw new ArithmeticException("Not valid operation");
			int i=1/0;
			System.out.println("completed");
			
	}
}
