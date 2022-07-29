package com.practice;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "My name is kotha nikhil raj";
		
		String[] str = s.split(" ");
		
		String rev= "";
		for(int i=0;i<str.length;i++) {
			
			rev=str[i]+rev;
			
			}
		System.out.println(rev);
	}

}
