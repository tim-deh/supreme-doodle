package com.ss.training.sumargs;

public class SumArgs {
	private static String sum = "";

	public static void main(String[] args) {
		for (String i: args) {
			sum += i;
		}
		System.out.println(sum);
	}

}
