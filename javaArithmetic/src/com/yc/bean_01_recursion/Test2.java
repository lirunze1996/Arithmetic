package com.yc.bean_01_recursion;

//斐波那契数列
//1 1 2 3 5 8 13 21 34 55
public class Test2 {

	public static void main(String[] args) {
		System.out.println(fib(7));
	}

	public static long fib(long index) {
		if (index == 1) {
			return 1;
		} else if (index == 2) {
			return 1;
		} else {
			return fib(index - 1) + fib(index - 2);
		}
	}
}
