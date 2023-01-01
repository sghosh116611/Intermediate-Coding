package com.java.numbers;

import java.util.Scanner;

// Program to print first N natural numbers on reverse

public class NaturalNumberInReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--) {
			System.out.println(i);
		}
	}

}
