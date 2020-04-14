package com.ss.training.randomGame;

import java.util.Random;
import java.util.Scanner;

public class PrintGame {

	public static void main(String[] args) {
		Random rand = new Random();

		final int n = rand.nextInt(101);
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Guess a number between 1-100 within the range of 10:");
		
		int num = reader.nextInt();
		
		for ( int i = 1; i < 5; i++ ) {
			if ( num <= (n - 10) || num >= (n + 10) ) {
				System.out.println("You failed to guess within a range of ten, you have " + (5-i) + " guesses left:");
				num = reader.nextInt();
			} else {
				break;
			}

		}
		
		if ( num <= (n - 10) || num >= (n + 10) ) {
			System.out.println("Sorry, you lost. The number was: " + n);
		} else {
			System.out.println("You win, the number is: " + n);
		}
		
		reader.close();

	}

}
