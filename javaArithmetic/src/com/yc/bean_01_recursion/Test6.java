package com.yc.bean_01_recursion;

import java.io.File;

//递归求出一个目录下所有文件的大小
public class Test6 {

	public static void main(String[] args) {
		File f = new File("D:\\Test");
		System.out.println(getSize(f));
	}

	public static long getSize(File file) {
		long size = 0;
		if (file.isDirectory()) {
			File[] fs = file.listFiles();
			if (fs != null && fs.length > 0) {
				for (File f : fs) {
					size += getSize(f);
				}
			}
		} else {
			size += file.length();
		}
		return size;
	}
}
