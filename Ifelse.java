package com.Practicejava.org;

import java.util.Scanner;

public class Ifelse {
	
	public static void main(String[] args) {
       
		
		
		
		int a;
        int b;
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value a");
        a=scanner.nextInt();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value b");
        b=sc.nextInt();
		
        
        if(a>b){
		System.out.println(a);
		}
		else
			System.out.println(b);
		
		
	}

}
