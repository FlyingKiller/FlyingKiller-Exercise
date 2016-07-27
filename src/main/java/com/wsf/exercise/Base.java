package com.wsf.exercise;

import java.util.Date;

public class Base {
	protected static int[] array = { 44, 2, 1, 0, 99, 14, 32, 67, 51, 72, 9, 113, 114, 67, 23, 16 };
	protected static int length = array.length;
	protected static Long beforeTime = 0l;
	protected static Long afterTime = 0l;

	public static void getBeforeTime() {
		beforeTime = new Date().getTime();
	}

	public static void getAfterTime() {
		afterTime = new Date().getTime();
	}

	public static void outPutArray() {
		for (int i = 0; i < length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("运行时间为：" + afterTime + "   " + beforeTime + "   " + (afterTime - beforeTime));
	}
}
