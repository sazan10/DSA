package com.dsa;

public class Quick_sort {

	public int[] sort(int[] data2, int start, int end) {

		int pivot = 0;
		if (start < end) {
			pivot = partition(data2, start, end);
			sort(data2, start, pivot - 1);
			sort(data2, pivot + 1, end);
		}
		return data2;
	}

	public int partition(int[] data3, int start, int end) {
		int i = start;
		int piv = data3[end];
		int temp = 0;
		for (int j = start; j < end; j++) {
			if (piv >= data3[j]) {
				temp = data3[i];
				data3[i] = data3[j];
				data3[j] = temp;
				i++;
			}
		}
		temp = data3[i];
		data3[i] = data3[end];
		data3[end] = temp;
		return i;

	}

}
