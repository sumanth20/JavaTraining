package com.sageit.javaprograms;

public class FibonacciSeries {
	int x;
	int y = 0;
	int z = 1;
	int i;
	int k;
	//Default constructor
	public FibonacciSeries(){
		
	}
	
	//parameterized constructor
	public FibonacciSeries(int count){
		this.x = count;
	}
   public void printFibonacciNums(){
	   System.out.println(y);
	   System.out.println(z);
	   for(i=2;i<=x;++i){
	    k = y+z;
	   
	   System.out.println(k);
	   
	   y =z;
	   z =k; 
	   }  
	}
   
   public void printFibonacciRange(){	  
	   System.out.println(y);
	   System.out.println(z);
	   do{		   
		    k = y+z;	
		    if(k<x){
		     System.out.println(k);
		    }
		   y =z;
		   z =k; 
	   }while(k<x);
	}
}
