package com.greatelearning.driver;

import java.util.Scanner;

import com.greatlearning.service.BalancedBrackets;

public class DriverBalancedBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string to check whether it has balanced brackets: ");
		String inputString = sc.next();

		System.out.println("Entered string: " + inputString);
		BalancedBrackets BalancedBrack = new BalancedBrackets();
		boolean isBalanced = BalancedBrack.areBracketsBalanced(inputString);
		if (isBalanced)
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");

		sc.close();
	}

}
