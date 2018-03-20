package com.sageit.javaprograms;

public class ExceptionHandling {
	public static void main(String args[]) {
	      int num1, num2;
	      try {
	        
	         num1 = 0;
	         num2 = 62 / num1;
	         System.out.println(num2);
	         System.out.println("end of try block");
	      }
	      catch (ArithmeticException e) { 
	        
	         System.out.println("You should not divide a number by zero");
	      }
	      catch (Exception e) {
	         /* This is a generic Exception handler which means it can handle
	          * all the exceptions. This will execute if the exception is not
	          * handled by previous catch blocks.
	          */
	         System.out.println("Exception occurred");
	      }
	      System.out.println("I'm out of try-catch block in Java.");
	   }

}
