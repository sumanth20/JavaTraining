package com.sageit.javaprograms;

public class Class1 {
	public String name ="Sumanth";
	private long phoneNumber = 123456789;
	protected int ssn = 9999;
	 float b = 6.4f;
	  
	public void name() 
	{
		System.out.println("Name is " + "Kalathuru " + name);
	}
    private void phno(){
    	System.out.println("the phone number is " + "001 " + phoneNumber);
    }
    	void height(){
    		System.out.println("Height is " + b );
    	
    	}
     
	public static void main(String[] args) 
	{
		System.out.println("example");
		Class1 c = new Class1();
		c.name();
		c.phno();
		c.height();
	}

}
