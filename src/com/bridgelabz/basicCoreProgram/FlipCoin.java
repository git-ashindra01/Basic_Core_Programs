package com.bridgelabz.basicCoreProgram;
import java.util.Scanner;
import java.util.Random;

public class FlipCoin {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Enter how many times you want to flip the coin?");
		int flip_coin_times = scanner.nextInt();
		
		double heads = 0;
		double tails = 0;
		Double percentage_HeadsByTails;
		
		for (int i=1 ; i <= flip_coin_times ; i++  ) {
			
			Boolean flip_coin = random.nextBoolean();
			
			if (flip_coin == true) {
				heads++;
				}
			
			else {
				tails++;
			}
		}
		
		percentage_HeadsByTails = heads / flip_coin_times * 100;
		System.out.println( percentage_HeadsByTails + " % is the percentage of Heads out of Tails ");
		System.out.println( 100 - percentage_HeadsByTails + " % is the percentage of Tails out of Heads ");
	}

}
