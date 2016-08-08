package com.wsf.another;

public class Test implements Itest {
	private int i = 10;

	public void setI(int i) {
		this.i = i;
	}

	public int getI() {
		return this.i;
	}

	private Test() {

	}

	public static Test instance() {
		return new Test();
	}

}
