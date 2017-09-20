package com.yc.bean_01_recursion;

//打印n次消息
public class Test3 {

	public static void main(String[] args) {
		print("Hello World", 3);
	}

	public static void print(String message, long count) {
		if (count > 0) {
			System.out.println(message);
			print(message, count - 1);
		}
	}
}
