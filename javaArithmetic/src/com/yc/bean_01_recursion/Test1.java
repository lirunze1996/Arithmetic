package com.yc.bean_01_recursion;

//计算n的阶乘
public class Test1 {
	public static void main(String[] args) {
		System.out.println(factorial(3));
	}

	// 终止条件
	// n==1 return 1
	public static long factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
