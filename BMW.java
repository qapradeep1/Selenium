//overriding

package com.Practicejava.org;

class Car {
		   public void eat()
		   {
		      System.out.println("Car is red in colour");
		   }
		}
		 public class BMW extends Car{
		   public void colour(){
		      System.out.println("BMW is red in colour ");
		   }
		   public static void main( String args[]) {
		      BMW obj = new BMW();
		      obj.colour();
		   }
		}


