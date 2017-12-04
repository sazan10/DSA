package com_assignment;

public class App {

	public static void main(String[] args) {
		Stack stacks = new Stack();
		System.out.println(stacks.push(1));
		System.out.println(stacks.peek());
		System.out.println(stacks.push(23));
		System.out.println(stacks.peek());
		System.out.println(stacks.push(4));
		System.out.println(stacks.peek());
		System.out.println(stacks.push(50));
		System.out.println("STACK: " + stacks);
		System.out.println(stacks.peek());
		System.out.println(stacks.pop());
		System.out.println(stacks.peek());
		System.out.println(stacks.pop());
		System.out.println(stacks.peek());
		System.out.println("STACK: " + stacks);
	}

}
