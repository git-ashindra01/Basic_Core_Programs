package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class VowelConsonant {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a scanner object
    System.out.print("Enter an alphabet: ");  // Prompt the user for an alphabet
    char c = sc.next().charAt(0);  // Read the first character of the input

    // Check if c is a vowel or consonant
    switch (Character.toLowerCase(c)) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println(c + " is a vowel");
        break;
      default:
        System.out.println(c + " is a consonant");
    }
  }
}

