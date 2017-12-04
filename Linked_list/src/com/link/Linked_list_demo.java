package com.link;

public class Linked_list_demo {
	public static void main(String[] args) {
		Link list = new Link();
		list.insertAtHead(3);
		list.insertAtHead(4);
		list.insertAtHead(15);
		list.insertAtHead(45);
		System.out.println(list);
		System.out.println("length = "+list.length());// displays length of list 
		list.DeleteHead();// deletes data at head
		System.out.println(list);
		System.out.println("length = "+list.length());
		System.out.println("Searching "+ list.search(4));// searches data and prints it if found else prints null
	}
}
