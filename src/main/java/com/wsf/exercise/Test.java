package com.wsf.exercise;

public class Test {
	protected int[] array = { 44, 2, 1, 99, 8 };
	protected int length = array.length;

	public void sort() {
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
