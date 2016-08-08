package com.wsf.exercise;

public class InsertSort extends Base {
	public static void sort() {
		int msg = 0;
		int tag = 0;
		for (int i = 1; i < length; i++) {
			for (int k = 0; k < i; k++) {
				if (array[i] < array[k]) {
					tag = i;
					msg = array[i];
					while (tag > k) {
						array[tag] = array[tag - 1];
						tag--;
					}
					array[k] = msg;
				}
			}
		}
	}

	public static void antherSort() {
		for (int i = 1; i < length; i++) {
			int tag = array[i];
			int k = i - 1;
			for (; k >= 0; k--) {
				if (tag < array[k]) {
					array[k + 1] = array[k];
				}
			}
			if (tag < array[k + 1]) {
				array[k + 1] = tag;
			}
		}
	}

	public static void main(String[] args) {
		getBeforeTime();
		antherSort();
		getAfterTime();
		outPutArray();
	}
}
