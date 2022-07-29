package com.practice;

import java.util.Arrays;

public class ArrayIntersection {
	
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {24,35,65,7,1,786,878,9};
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//		
//		int i=0,j=0;
//		
//		int n= arr1.length;
//		
//		int m = arr2.length;
//		
//		while(i<n && j<m) {
//			
//			if(arr1[i]==arr2[j]) {
//				i++;
//				j++;
//				System.out.println(arr1[i] + " " +arr2[j]+ " " + i+ " " + j);
//			}
//			else if(arr1[i]<arr2[j]){
//				i++;
//			}else {
//				j++;
//			}
//			
//		}
		
		Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        int n = arr1.length;
        int m = arr2.length;
        while(i<n && j<m)
        {
            if(arr1[i] == arr2[j])
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j])
                i++;
            else
                j++;
        }
	}
		
		
	}
