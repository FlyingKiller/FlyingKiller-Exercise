package com.wsf.exercise;

public class QuickSort extends Base {
	public static void sort(int[] array, int tag, int item) {
		for (int i = 0; i < length; i++) {
			if (array[i] < item) {
				System.out.println(232);
			}
		}
	}

	public static void main(String[] args) {
		getBeforeTime();
		sort(array, 0, array[0]);
		getAfterTime();
		outPutArray();
	}
}
