package com.Practicejava.org;

public class overriding {
	class Car{
		   public void eat()
		   {
		      System.out.println("Car is red in colour");
		   }
		}
		class BMW extends Car{
		   public void colour(){
		      System.out.println("BMW is red in colour ");
		   }
		   public void main( String args[]) {
		      BMW obj = new BMW();
		      obj.colour();
		   }
		}

}
