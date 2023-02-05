package com.bridgelabz.basicCoreProgram;
import java.util.Scanner;

public class PowerOfTwo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the no. of power you want to find out of 2");
		int exponential = scanner.nextInt();
		int powerOfTwo = 1;
		
		for (int i = 1; i <= exponential; i++) {
			powerOfTwo = powerOfTwo * 2;
			System.out.println("2 to the power of " + i + " is : " + powerOfTwo);
//			i = powerOfTwo;
//			
		}
	}

}
