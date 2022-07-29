package com.practice;

public class ConsecutiveDupliactes {
	
	public static void main(String[] args) {
		try {
			
		
		String str = "aaabbbcccc";
		
		String new_s = "" ;
		
		char a;
		
		for(int i=0;i<str.length()-1;i++) {
			 a = str.charAt(i);
			 if(i  == 0) {
				 new_s=new_s+a;
				 continue;
			 }
			 for(int j=i+1;j<str.length();j++) {
				 new_s=str.charAt(i)==str.charAt(j)? new_s:new_s+str.charAt(i);
			 }
			
		}
		System.out.println(new_s);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
