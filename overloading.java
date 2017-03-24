package com.Practicejava.org;

public class overloading {

	
	    public void disp(char c)
	    {
	         System.out.println(c);
	    }
	    public void disp(char c, int num)  
	    {
	         System.out.println(c + " "+num);
	    }
	}
	class Sample
	{
	   public void main(String args[])
	   {
	       overloading obj = new overloading();
	       obj.disp('A');
	       obj.disp('A',40);
	   }

	}
