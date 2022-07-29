package com.practice;

public class ArraySumRecursion {
	
	public static  int sum(int arr[]) {
		int n= arr.length;
		if(n==1) {
			return arr[0];
		}
	int new_arr[] = new int[n-1];
	for(int i=1;i<arr.length;i++) {
		new_arr[i-1] = arr[i];
	}
	return sum(new_arr)+arr[0];

	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sum = sum(arr);
		System.out.println(sum);
		
	}
}
