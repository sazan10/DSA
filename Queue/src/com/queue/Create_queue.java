package com.queue;

import java.util.Arrays;

public class Create_queue {

	private int[] q = new int[10];
	private int head = -1;
	private int tail = -1;

	public void enqueu(int a) {
		if (head == q.length) {
			head = 0;
			this.enqueu(a);

		} else if (tail < q.length - 1 && head <= tail) {
			if (head < 0) {
				head++;
				tail++;
				q[tail] = a;
			} else {
				tail++;
				q[tail] = a;

			}

			System.out.println(a + " has been enqueued");
		} else if (Math.abs(tail - head) < (q.length - 1)) {
			if (tail == q.length - 1) {
				tail = -1;
			}
			tail++;
			if (tail != head) {

				q[tail] = a;

				System.out.println(a + " has been enqueued");
			} else {
				System.out.println("queue is full");
				--tail;
			}
		}

		else {
			System.out.println("queue is full");
			--tail;
		}
	}

	public void dequeu() {

		System.out.println(q[head] + " has been dequeued");
		q[head] = 0;
		head++;
		if (head == q.length)
			head = 0;
	}

	public String peek() {
		return "PEEK OPERATION: Value at head: " + head;
	}

	@Override
	public String toString() {
		return Arrays.toString(q);
	}
}
