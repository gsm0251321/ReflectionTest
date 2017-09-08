package com.lesson3.bean;

import java.util.HashMap;
import java.util.List;

public class Son extends Farther {
	int c;

	private String d;

	protected float e;

	public List<Car> cars;

	public HashMap<Integer, String> map;

	private Son() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Son(int c, String d) {
		super();
		this.c = c;
		this.d = d;
	}
}
