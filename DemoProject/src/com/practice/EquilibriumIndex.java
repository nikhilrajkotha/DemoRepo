package com.practice;

public class EquilibriumIndex {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 56, 1, 2, 3, 4, 5, };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int ls=0,rs=0;
		
		for(int i=1;i<arr.length-1;i++) {
			
			ls+=arr[i-1];
			rs= sum-ls-arr[i];
			
			if(ls==rs) {
				System.out.println(i+1);
				break;
			}
			
		}
		

	}
}
