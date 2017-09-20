package com.yc.bean_04_insertsort;

//插入排序
public class InsertionSorter {

	private int[] a;

	public InsertionSorter(int[] a) {
		this.a = a;
	}

	//假定第一个元素是已经排好序的，从第二个元素循环整个数组
	//取出当前的值
	//记录当前的元素的索引
	//循环将当前的值与前面的值进行比较，如果当前的值比前面元素的值小，则将前面的值向后移，再将索引向前移动，直到移动到数组的开头索引0位置
	//将当前的值放到合适的位置
	public void sort() {
		for (int i = 1; i < a.length; i++) {
			// 取i的值，与数组中前面的元素的最后一个比（i-1）
			int next = a[i];
			// 记录当前的索引
			int j = i;
			while (j > 0 && a[j - 1] > next) {
				// 交换
				a[j] = a[j - 1];
				j--;
			}
			a[j] = next;
		}
	}
}
