package com.yc.bean_02_bubblesort;

//冒泡法排序
public class BubbleSorter {

	private int[] a;

	public BubbleSorter(int[] a) {
		this.a = a;
	}

	public void sort() {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if(a[j]>a[j+1]){	//稳定算法
					swap(j, j+1);
				}
			}
		}
	}
	
	private void swap(int maxPos, int i){
		int temp = a[i];
		a[i] = a[maxPos];
		a[maxPos] = temp;
	}
}
