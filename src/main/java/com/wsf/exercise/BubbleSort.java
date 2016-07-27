package com.wsf.exercise;

public class BubbleSort extends Base {

	public static void sort() {
		int tag = 0;
		for (int i = array.length; i > 0; i--) {
			for (int k = 0; k < array.length; k++) {
				if (k != array.length - 1) {
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
		sort();
		out();
	}
}
