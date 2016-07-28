package com.wsf.exercise;

/**
 * 选择排序的思想是一一比对得出较小值，先存入中间变量中，等待循环结束时在进行数据交换
 * 
 * @author FlyingKiller
 *
 */
public class SelectSort extends Base {
	public static void sort() {
		for (int i = 0; i < length - 1; i++) {// 外围循环,控制比较基数，依次加1.
			int min = array[i];
			int tag = 0;
			for (int k = i + 1; k < length; k++) {// 内层循环,循环比较元素
				if (array[k] < min) {
					min = array[k];
					tag = k;
				}
			}
			if (min < array[i]) {
				array[tag] = array[i];
				array[i] = min;
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
