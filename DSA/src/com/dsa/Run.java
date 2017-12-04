package com.dsa;

import java.util.Arrays;
import java.util.Random;

public class Run {

	private Random rand = new Random();
	private int[] data = new int[1000];

	Merge_sort merge = new Merge_sort();

	public Run() {
		for (int i = 0; i < 1000; i++) {

			data[i] = (int) rand.nextInt(1000);
		}
		System.out.println(Arrays.toString(data));

		System.out.println();
	}

	public void quick_sort() {
		int[] data1 = Arrays.copyOf(data, data.length);
		Quick_sort quick = new Quick_sort();
		System.out.println("\nUsing quick sort");
		System.out.println(Arrays.toString(data1));
		System.out.println(Arrays.toString(quick.sort(data1, 0, data1.length - 1)));

		// Arrays.fill(data1, (Integer) 0);

	}

	public void insertion_sort() {
		int[] data1 = Arrays.copyOf(data, data.length);
		System.out.println(Arrays.toString(data1));
		Insertion_sorting quick1 = new Insertion_sorting();
		System.out.println("\nUsing insertion sort");
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(quick1.sort(data1)));

	}

	public void merge_sort() {
		int[] data1 = Arrays.copyOf(data, data.length);
		Merge_sort quick2 = new Merge_sort();
		System.out.println("\nUsing Merge sort");
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(quick2.sort(data1, 0, data1.length - 1)));

	}
	public void Binary_tree() {
		int[] data1 = Arrays.copyOf(data, data.length);
		Binary_search_tree quick2 = new Binary_search_tree();
		System.out.println("\nUsing Binary Search Tree to traverse data in ascending order");
		System.out.println(Arrays.toString(data));
		for(int i = 0 ; i<data1.length;i++)
		{
			quick2.insert(data1[i]);
		}
		quick2.traverse();
	}
	public void Binary_search() {
		int[] data1 = Arrays.copyOf(data, data.length);
		Quick_sort quick = new Quick_sort();
		quick.sort(data1, 0, data1.length - 1);
		Binary_search quick2 = new Binary_search();
		System.out.println("\nUsing Binary Search Algorithm");
		quick2.search(data1,5,0,data1.length);
	}


}
