package com.java.numbers;

import java.util.Scanner;

//Print sum of first N natural numbers

public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int N = sc.nextInt();
		 
		System.out.println("Sum is "+ ((N * (N + 1)) / 2));
	}
}
