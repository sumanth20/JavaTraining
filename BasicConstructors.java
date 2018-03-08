package com.sageit.javaprograms;

public class BasicConstructors {
	int a;
	int b;
	int c;

	public BasicConstructors(int x, int y, int z){
		this.a = x;
		this.b = y;
		this.c = z;
		
	}
	
		public void getLargeNum(){
		if(a>b){
			System.out.println("greatest number"+ " is" + a );
		}else if(b>c){
			   System.out.println("greatest nmuber" +"is" + b);
		       }
			   else{
				   System.out.println("greatest number" + " is "  + c);
			   }
		}
		public static void main(String[] args){
			BasicConstructors cs = new BasicConstructors( 10,20,30);
			cs.getLargeNum();

		}
		
	
	}
	


