package com.wsf.exercise;

public class Base {
	protected static int[] array = { 44, 2, 1, 0, 99, 14, 32, 67, 51, 72, 9, 113, 114 };
	protected static int length = array.length;

	public static void outPutArray() {
		for (int i = 0; i < length; i++) {
			System.out.println(array[i]);
		}
	}
}
