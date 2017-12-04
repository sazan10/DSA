package com.bin;

public class App {

	public static void main(String[] args) {
		Binary_search_tree new_tree = new Binary_search_tree();

		new_tree.insert(10);// inserts data into binary search tree
		new_tree.insert(2);
		new_tree.insert(6);
		new_tree.insert(8);
		new_tree.insert(4);
		new_tree.insert(55);
		new_tree.insert(18);
		new_tree.insert(21);
		try {
			System.out.println(new_tree.find(89).getData());// find() searches for data and prints it if found 
		} catch (Exception NullPointerException) {
			System.out.println("Value not found");
		}
	}
}
