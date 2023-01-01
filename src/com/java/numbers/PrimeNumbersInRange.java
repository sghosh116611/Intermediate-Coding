package com.java.numbers;

import java.util.Scanner;

//Prime numbers in range - Sieve of Erathosthenis

public class PrimeNumbersInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit");
		int l = sc.nextInt();
		System.out.println("Enter upper limit");
		int h = sc.nextInt();
		boolean primes[] = new boolean[h + 1];
		for(int i = 0 ; i< primes.length; i++) {
			primes[i] = true;
		}
		for(int i = 2; i*i <= h; i++) {
			if(primes[i] = true) {
				for(int j = i * i; j <= h; j+=i) {
					primes[j] = false;
				}
			}
		}
		for(int i = l; i <= h; i++) {
			if(primes[i] == true) {
				System.out.println(i);
			}
		}
		
	}

}
