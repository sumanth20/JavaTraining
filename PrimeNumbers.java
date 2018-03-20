package com.sageit.javaprograms;

public class PrimeNumbers {
	public static void main(String[] args) {

	    int num = 45;
	    boolean x = false;
	    for(int i = 2; i <= num/2; ++i)
	    {
	        
	        if(num % i == 0)
	        {
	            x = true;
	            
	        }
	    }

	    if (x)
	        System.out.println(num + " is a prime number.");
	    else
	        System.out.println(num + " is not a prime number.");
	    }

}
