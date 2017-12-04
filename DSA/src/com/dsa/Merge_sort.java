package com.dsa;

public class Merge_sort {

	
	 public int[] sort(int [] data, int start, int end) {
		
		if (start < end) {
			int middle = Math.floorDiv(end + start, 2);
			sort(data, start, middle);
			sort(data, middle + 1, end);
			merge(data, start, middle, end);
		}

		return data;

	}

	public int merge(int[] data, int start, int middle, int end) {

		int size1 = middle - start + 1;
		int size2 = end - middle;
		int [] left = new int[size1+1];
		int[] right = new int [size2+1];
		int i = 0;
		int j = 0;
		for (i = 0; i < size1; i++)
			left[i] = data[i + start];
		for (j = 0; j <size2 ; j++)
			right[j] = data[middle + 1 + j];
		left[i]=9999999;
		
		right[j]=9999999;
		
		i = 0;
		j = 0;
		for(int k=start; k<=end; k++) { 
			if(left[i]<=right[j])
		      data[k]=left[i++];
		    else
		      data[k]=right[j++];
		}
		return 0;

	}
	
}
