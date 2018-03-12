package com.sageit.javaprograms;

public class Animal implements Inter {
	public void eat() {
	      System.out.println("Mammal eats");
	   }

	   public void travel() {
	      System.out.println("Mammal travels");
	   } 

	   public int noOfLegs() {
	      return 0;
	   }

	   public static void main(String args[]) {
	      Inter m = new Animal();
	      m.eat();
	      m.travel();
	      
	   }
	} 


