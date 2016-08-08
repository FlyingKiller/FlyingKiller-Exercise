package com.wsf.another;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AnotherTest {

	public List creatFactory(String tag) {
		if (tag.equals("ArrayList")) {
			return new ArrayList();
		} else if (tag.equals("LinkedList")) {
			return new LinkedList();
		} else {
			System.out.println("error");
			return null;
		}
	}

	public static void main(String[] args) {
		AnotherTest anotherTest = new AnotherTest();
		List item = anotherTest.creatFactory("ArrayList");
		System.out.println(item.getClass());
	}

}
