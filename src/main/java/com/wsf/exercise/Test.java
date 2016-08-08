package com.wsf.exercise;

public class Test {
	protected int[] array = { 44, 2, 1, 99, 8, 31, 12, 26, 59, 123 };
	protected int length = array.length;

	public void sort() {
		for (int i = 1; i < length; i++) {
			int tag = array[i];
			int k = i - 1;
			for (; k >= 0 && tag < array[k]; k--) {
				if (tag < array[k]) {
					array[k + 1] = array[k];
				}
			}
			if (tag < array[k + 1]) {
				array[k + 1] = tag;
			}
		}
	}

	public void outPutArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.sort();
		test.outPutArray();
	}
}
