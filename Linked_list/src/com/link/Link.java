package com.link;

public class Link {

	private Node head;

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;

	}

	public int length() {
		Node current = this.head;
		int i = 0;
		while (current != null) {
			i++;
			current = current.getNextNode();
		}

		return i;
	}

	public void DeleteHead() {

		Node newNode = this.head.getNextNode();
		this.head = newNode;
	}

	public Node search(int data) {
		Node current = this.head;
		while (current != null) {
			if (current.getData() == data)
				return current;
			current = current.getNextNode();
		}
		return null;
	}

	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		while (current != null) {
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		result += "}";
		return result;
	}
}
