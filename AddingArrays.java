package com.Practicejava.org;

public class AddingArrays {

			   public static void main(String[] args) {
			      int[] k = {1, 2, 3, 4};

			      // Print all array elements
			      for (int i = 0; i < k.length; i++)
			      {
			         System.out.println(k[i]);
			      }
			     
			      // Summing all elements
			      int total = 0;
			      
			      for (int i = 0; i < k.length; i++)
			      {
			         total += k[i];
			      }
			      System.out.println("Total is " + total);
			      
			     // Finding the largest element
			   /*   int max = k[0];
			      
			      for (int i = 1; i < k.length; i++)
			      {
			         if (k[i] > max) max = k[i];
			      }
			      System.out.println("Max is " + max);  
			      */
			   }
			

	}

