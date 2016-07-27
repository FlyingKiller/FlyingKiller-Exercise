package com.wsf.exercise;

public class Base {
	protected static int[] array = { 44, 2, 1, 0, 99, 14, 32, 67, 51, 72 };

	public static void out() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
