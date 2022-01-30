package com.greatelearning.driver;

import java.util.ArrayList;
import java.util.Collections;

import com.greatlearning.service.FindLongestPath;
import com.greatlearning.service.Node;

public class DriverBinaryTree {

	public static void main(String[] args) {
		// Create a node
		// build a tree

		Node root = new Node(100);
		root.left = new Node(20);
		root.right = new Node(130);
		root.left.left = new Node(10);
		root.left.right = new Node(50);
		root.right.left = new Node(110);
		root.right.right = new Node(140);
		root.left.left.left = new Node(5);

		// findLongestPath
		ArrayList<Integer> output = FindLongestPath.findLongestPath(root);

		// Print the longest path
		System.out.println("The longest path is : ");
		Collections.reverse(output);

		System.out.println(output);
	}

}
