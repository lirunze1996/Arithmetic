package com.yc.bean_01_recursion;

//判断回文：字符串截取
public class Test4 {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("abcbac"));
	}
	
	// "c" -> true
	// "bb" -> true
	// "bab" -> true
	// "abcba" -> true
	public static boolean isPalindrome(String str){
		if( str.length() <= 1){
			return true;
		}else if( str.charAt(0) != str.charAt(str.length()-1) ){
			return false;
		}else{
			String newStr = str.substring(1, str.length()-1);
			return isPalindrome(newStr);
		}
	}
	
}
