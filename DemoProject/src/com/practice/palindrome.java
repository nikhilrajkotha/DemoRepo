package com.practice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String rev="";
		//reverse String with straight traversall;
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
		
		//palindrome
		int i=0,j=s.length()-1;
		boolean pal=true;
		while(i<j) {
			if(s.charAt(i) != s.charAt(s.length()-j)) {
				pal=false;
				break;
			}else {
				i++;
				j--;
			}
		}
		System.out.println(pal);
	}
}
