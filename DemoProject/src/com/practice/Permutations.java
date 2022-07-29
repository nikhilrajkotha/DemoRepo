package com.practice;

public class Permutations {
	
	static String permutations(String str,int i) {
		
		int count = i;
		String str2 = "";
		String str3= "";
		for(int j=0;j<count;j++) {
			str2 +=str.charAt(j);
		}
		for(int j=i;j<str.length();j++) {
			str3+= str.charAt(j);
		}
		str3 = str3+str2;
		System.out.println(str3);
		boolean result = palindrome(str3);
		if(result == true) {
			return str3;
		}
		return null;
	}
	
	public static Boolean palindrome(String s) {
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
		
		return pal;
		
	}
	
	public static void main(String[] args) {
		
		String str = "aabaa";	
		System.out.println(palindrome(str));
	
		
		for(int i=0;i<str.length();i++) {
			
			 String result = permutations(str,i);
			 System.out.println(result);
			 if(result == null) {
				continue;
				 
			 }
			 System.out.println(result);
			
		}
		
		
	}
}

//abc
//a
//bc+a
//bca pali
//string 

