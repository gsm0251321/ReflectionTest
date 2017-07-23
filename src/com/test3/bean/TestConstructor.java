package com.test3.bean;

public class TestConstructor {
	private String self;

	public TestConstructor() {
		self = " Frank ";
	}

	public TestConstructor(String self) {
		this.self = self;
	}

	@Override
	public String toString() {
		return "TestConstructor [self=" + self + "]";
	}

}
