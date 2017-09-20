package com.yc.bean_02_bubblesort;

import java.util.Scanner;

import com.yc.utils.ArrayUtil;
import com.yc.utils.StopWatch;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组大小：");
		int n = sc.nextInt();

		int[] a = ArrayUtil.randomIntArray(n, 100);
		BubbleSorter sorter = new BubbleSorter(a); // 初始化算法类
		// 初始化秒表
		StopWatch timer = new StopWatch();
		timer.start(); // 启动秒表

		sorter.sort(); // 开始排序

		timer.stop(); // 停止秒表

		System.out.println("总计费时：" + timer.getElapsedTime() + " ms");

		//ArrayUtil.print(a);
	}
}
