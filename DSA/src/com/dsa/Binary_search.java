package com.dsa;

public class Binary_search {
	
	public int search(int [] data,int value,int start, int end)
	{
		
		int mid = Math.floorDiv(start+end, 2);
		
		if(end<start)
			{
			System.out.println ("value "+ value+" not found");
			return 0;
			}
		else if  (value==data[mid])
			System.out.println("Found value "+ data[mid]+" in array at index "+mid);
		else if(value>data[mid])
			search (data, value, mid+1,end);
		else if (value<data[mid])
			search(data,value, start, mid-1);
		
	return 0;
	}
	

}
