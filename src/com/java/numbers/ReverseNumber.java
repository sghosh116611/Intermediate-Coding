package com.java.numbers;

import java.util.Scanner;

//Reverse of number

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			int dig = n % 10;
			sum = sum * 10 + dig;
			n /= 10;
		}
		System.out.println("Reverse is:" + sum);
	}
}
