package com.greatlearning.service;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

	public boolean areBracketsBalanced(String inputString) {
		// Using ArrayDeque is faster than using Stack class
		Deque<Character> charStack = new ArrayDeque<Character>();

		// Traversing the Expression
		for (int charIndex = 0; charIndex < inputString.length(); charIndex++) {
			char inputChar = inputString.charAt(charIndex);

			if (inputChar == '(' || inputChar == '[' || inputChar == '{') {
				// Push it to the stack
				charStack.push(inputChar);
				continue;
			}

			// If current character is not opening bracket, then it must be closing.

			if (charStack.isEmpty()) // Stack should not be empty at this point.
				return false;

			char check;
			switch (inputChar) {
			case ')':
				check = charStack.pop();
				if (check != '(') // (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = charStack.pop();
				if (check != '{') // (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = charStack.pop();
				if (check != '[') // (check == '(' || check == '{')
					return false;
				break;
			}
		}

		// Check Empty Stack
		return (charStack.isEmpty());
	}

}
