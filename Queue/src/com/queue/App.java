package com.queue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Create_queue new_queue= new Create_queue();
		new_queue.enqueu(12);
		new_queue.enqueu(5);
		new_queue.enqueu(36);
		new_queue.enqueu(5);
		System.out.println(new_queue);
		new_queue.dequeu();
		System.out.println(new_queue);
		new_queue.enqueu(10);
		new_queue.enqueu(8);
		new_queue.enqueu(2);
		new_queue.enqueu(14);
		System.out.println(new_queue);
		new_queue.dequeu();
		new_queue.dequeu();
		System.out.println(new_queue);
		System.out.println(new_queue);
		new_queue.enqueu(32);
		new_queue.enqueu(11);
		new_queue.enqueu(21);
		new_queue.enqueu(44);
		new_queue.enqueu(46);
		System.out.println(new_queue);
		new_queue.enqueu(50);
		System.out.println(new_queue);
		new_queue.dequeu();
		System.out.println(new_queue);
		new_queue.enqueu(100);
		System.out.println(new_queue);
		System.out.println(new_queue.peek());
		new_queue.dequeu();
		System.out.println(new_queue.peek());
		
		
	}

}
