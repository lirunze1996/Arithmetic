package com.yc.bean_03_selectionsort;

//选择排序
public class SelectionSorter {

	private int[] a;

	public SelectionSorter(int[] a) {
		this.a = a;
	}

	// 排序方法
	public void sort() {
		// 循环整个数组
		for (int i = 0; i < a.length; i++) {
			int minPos = minimumPosition(i);
			//与第i个元素进行交换
			swap(minPos, i);
		}
	}

	/**
	 * 在数组的最后找出最小的元素，记住下标
	 * @param from：	要比较的第一个位置
	 * @return：	在a数组的from到length-1的位置的最小元素位置
	 */
	private int minimumPosition(int from) {
		// 定义一个变量用来存最小元素的，首先假设最小元素为from
		int minPos = from;
		// 从from+1开始循环，查找到这个数组的最后，求出最小元素的索引
		for (int i = from + 1; i < a.length; i++) {
			if (a[i] < a[minPos]) {
				minPos = i;
			}
		}
		return minPos;
	}
	
	
	private void swap(int minPos, int i) {
		int temp = a[minPos];
		a[minPos] = a[i];
		a[i] = temp;
	}
}
