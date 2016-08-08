package com.wsf.exercise;

/**
 * 冒泡排序的思想是两两比较，较大的元素向上冒泡。
 * 
 * @author FlyingKiller
 */
public class BubbleSort extends Base {
	public static void sort() {
		int tag = 0;
		for (int i = length - 1; i > 0; i--) {
			for (int k = 0; k < i; k++) {
				if (array[k] > array[k + 1]) {
					tag = array[k];
					array[k] = array[k + 1];
					array[k + 1] = tag;
				}
			}
		}
	}

	public static void main(String[] args) {
		getBeforeTime();
		sort();
		getAfterTime();
		myOutPutArray(0);
	}
}
