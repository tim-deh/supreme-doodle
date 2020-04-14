package com.ss.training.printGame;

import static java.lang.System.out;

public class PrintGame {
	
	static int dashes = 9;

	public static void main(String[] args) {
        one();
        two();
        three();
        four();
	}
	
	public static void printdash() {
		for ( int i = 1; i <= dashes; i++ ) {
			out.print("-");
		}
		out.println();
		dashes++;		
	}
	
	private static void one() {
		out.println("1)");
		
		// the stair steps
		for ( int i = 1; i <= 4; i++ ) {
			for ( int j = 1; j <= i; j++) {
				out.print("*");
			}
			out.println();
		}
		
		printdash();

	}
	
	private static void two() {
		out.println("2)");
		
		printdash();
		
		for ( int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				out.print("*");
			}
			out.println();
		}
		
	}
	
	private static void three() {
		out.println("3)");
		
		for ( int j = 6, h = 1; h <= 7; j--, h += 2 ) {
			for ( int k = 1; k <= j; k++) {
				if ( k != j ) {
					out.print(" ");
				} else {
					for ( int i = 1; i <= h; i++) {
						out.print("*");
					}
					out.println();
				}
			}
		}
		
		printdash();
		
	}
	
	private static void four() {
		out.println("4)|");
		
		printdash();
		
		for ( int j = 3, h = 7; h >= 1; j++, h -= 2 ) {
			for ( int k = 1; k <= j; k++ ) {
				if ( k != j ) {
					out.print(" ");
				} else {
					for ( int i = 1; i <= h; i++ ) {
						out.print("*");
					}
					out.println();
				}
			}
		}
		

	}

}
