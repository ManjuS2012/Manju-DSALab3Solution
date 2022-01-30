package com.greatlearning.service;

import java.util.ArrayList;

public class FindLongestPath {
	// static function
	// return ArrayList<Integer>
	// Node input

	public static ArrayList<Integer> findLongestPath(Node root) {
		// Basic condition
		if (root == null) {
			ArrayList<Integer> output = new ArrayList<>();
			return output;
		}

		// recursive root.right
		ArrayList<Integer> right = findLongestPath(root.right);

		// recursive root.left
		ArrayList<Integer> left = findLongestPath(root.left);

		// compare the size of right and left insert greatest
		if (right.size() < left.size()) {
			left.add(root.data);
		} else {
			right.add(root.data);
		}

		// return the Array list with the longest path
		return (left.size() > right.size() ? left : right);
	}
}
