package com.wsf.sort;

/**
 * 选择排序的思想是一一比对得出较小值，先存入中间变量中，等待循环结束时在进行数据交换
 * 
 * @author FlyingKiller
 *
 */
public class SelectSort extends Base {
	public static void sort() {
		for (int i = 0; i < length; i++) {
			int min = array[i];
			int tag = 0;
			for (int k = i + 1; k < length; k++) {
				if (array[k] < min) {
					min = array[k];
					tag = k;
				}
			}
			if (min < array[i]) {
				array[tag] = array[i];
				array[i] = min;
			}
		}
	}

	public static void main(String[] args) {
		sort();
		outPutArray();
	}
}
