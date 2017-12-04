package com.dsa;

public class App {

	public static void main(String[] args) {
	Run r= new Run();
	long start = System.currentTimeMillis();	
	r.quick_sort();
	long end= System.currentTimeMillis();
	System.out.printf("The time calculation for quick sort is  %d\n", (end-start));
	start = System.currentTimeMillis();	
	r.insertion_sort();
	end= System.currentTimeMillis();
	System.out.printf("The time calculation for insertion sort is %d\n", end-start);
	start = System.currentTimeMillis();	
	r.merge_sort();
	end= System.currentTimeMillis();
	System.out.printf("The time calculation for merge sort is %d \n",(end - start));
	r.Binary_tree();
	r.Binary_search();
	

	}

}
