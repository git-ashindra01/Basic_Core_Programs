package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int firstNum = 3;
		int secondNum = 5;
		
		firstNum = firstNum + secondNum;
		secondNum = firstNum - secondNum;
		firstNum = firstNum - secondNum;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		
	}

}
