package com.practice;

public class StringCompression {
	
	public static void main(String[] args) {
		
		//String str = "aaadddffghfrrr";
		StringBuffer str = new StringBuffer("aaadddffghfrrr");
		
		int i=0;int j=0;int count=0;
		for( i=count;i<str.length()-1;i++) {
			 count=1;
			for( j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					System.out.println(count);
				}else {
					break;
				}
			}
			for(int k=j;k<count;k++) {
				
			//	str.replace(count, k, null)
			}
		
			
			
		}
		System.out.println(str);
		
	}
}
