package com.yc.bean_01_recursion;

//判断回文：以索引来指向字符串，效率更高
public class Test5 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("abcba"));
	}

	private static boolean isPalindrome(String s) {
		return judge(s, 0, s.length() - 1);
	}

	private static boolean judge(String s, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return true;
		} else if (s.charAt(lowIndex) != s.charAt(highIndex)) {
			return false;
		} else {
			return judge(s, lowIndex + 1, highIndex - 1);
		}
	}
}
