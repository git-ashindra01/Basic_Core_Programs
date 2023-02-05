package com.bridgelabz.basicCoreProgram;
import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the no. for numerator");
		int numerator = scanner.nextInt();
		
		System.out.println("Enter the no. for denominator");
		int denominator = scanner.nextInt();
		
		int quotient = numerator / denominator;
		int remainder = numerator % denominator;
		
		System.out.println("The quotient of the number is : " + quotient);
		System.out.println("The remainder of the number is : " + remainder);
		
	}

}
