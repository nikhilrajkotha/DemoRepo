package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateInArray {
	public static void main(String[] args) {

//		int arr[] = { 0,2,1,3,1};
//
//		Arrays.sort(arr);
//
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(arr[i]==arr[i+1]) {
//				System.out.println(arr[i]);
//				break;
//			}
//		}
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		l.stream().filter(p->p%2==0).forEach(p-> System.out.print(p + " "));
		
	}
}
