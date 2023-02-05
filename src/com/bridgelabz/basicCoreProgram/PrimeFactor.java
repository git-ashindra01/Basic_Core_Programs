package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class PrimeFactor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: "); 
    int number = sc.nextInt(); 

    System.out.print("The prime factorization of " + number + " is: ");  

    for (int i = 2; i <= number; i++) {
      while (number % i == 0) {
        System.out.print(i + " ");  
        number /= i;
      }
    }

    System.out.println();
  }
}

