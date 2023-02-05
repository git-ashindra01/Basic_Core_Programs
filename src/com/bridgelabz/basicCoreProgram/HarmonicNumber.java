package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class HarmonicNumber {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter harmonic number times: "); 
	    int number = sc.nextInt(); 

	    double harmonic = 0.0;  
	    for (int i = 1; i <= number; i++) {
	      harmonic += 1.0 / i;  //
	    }
	    System.out.println("The " + number + "th harmonic number is " + harmonic);
	  }
}







