package com.wsf.exercise;

public class BubbleSort extends Base {
	public static void sort() {
		int tag = 0;
		for (int i = length - 1; i > 0; i--) {// 控制循环次数,对于长度为n的数组来说，只需要循环n-1.
			for (int k = 0; k < length; k++) {// for控制元素比较，每次循环比较的元素减少1个
				if (k != length - 1) {
					if (array[k] > array[k + 1]) {
						tag = array[k];
						array[k] = array[k + 1];
						array[k + 1] = tag;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		getBeforeTime();
		sort();
		getAfterTime();
		outPutArray();
	}
}
