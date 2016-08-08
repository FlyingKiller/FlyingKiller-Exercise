package com.wsf.exercise;

public class Test2 extends AbstractTest {
	protected int x = 0;

	public static void main(String[] args) {
		AbstractTest t = new Test2();// java多态的体现，声明了一个抽象类的引用，将其指向子类的实现，相当于将子类的对象装进抽象类的引用，所以对象能调用的仅限于抽象类中有的。
		System.out.println();
		t.test2();
	}

	@Override
	public void test2() {
		System.out.println(i);
	}
}
