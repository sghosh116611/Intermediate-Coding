package com.java.numbers;

import java.util.Scanner;

//Printing the sum in a given range

public class SumInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of range");
		int l = sc.nextInt();
		int h = sc.nextInt();
		int sum = 0;
		for(int i = l; i <= h; i++) {
			sum += i;
		}
		System.out.println("Sum is "+ sum);
	}

}
