package com.bridgelabz.basicCoreProgram;
import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the year(4-digit) to determine if it is a Leap year or not?");
		int year = scanner.nextInt();
		
		if (year % 4 == 0) {
			System.out.println( year +" is a Leap Year");
			
		} else {
			System.out.println( year +" is not a Leap Year");
		}
	}

}
