package com.digitAddition;

import java.util.Scanner;

public class AdditonDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to add :- ");
		int num = sc.nextInt();
		int rem;
		int sum = 0;
		while (num>0) {
			rem = num%10;
			sum = rem + sum;
			num = num/10;
		}
		System.out.println("Sum of digits :- "+sum);
		sc.close();

	}

}
