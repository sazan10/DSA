package com_assignment;

import java.util.Arrays;

public class Stack {
	private int[] a = new int[10];
	static int index = -1;

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public String push(int data) {
		index++;
		a[index] = data;
		return "PUSH OPERATION:" + a[index] + " has been pushed to top";
	}

	public String peek() {
		return "PEEK OPERATION: Value at top: " + a[index];
	}

	public String pop() {
		int b = a[index];
		a[index] = 0;
		index--;
		return "POP OPERATION: " + b + " has been removed from top";
	}

	@Override
	public String toString() {
		return Arrays.toString(a);
	}

}
