package com.practice;

import java.util.Scanner;

public class MinimumSum {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		int arr[] =new int[10];
		int rem=0,i=0;
		while(num>0) {
			rem = num%10;
			arr[i] = rem;
			num=num/10;
		}
		
		
		
		s.close();
	}	
}
