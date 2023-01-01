package com.java.numbers;

import java.util.Scanner;

//Sum of digits of a number

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0;
		while(n != 0) {
			int dig = n % 10;
			sum += dig;
			n /= 10;
		}
		System.out.println("Sum is:"+sum);
	}

}
