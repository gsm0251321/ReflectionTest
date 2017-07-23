package com.test1.test;

import java.lang.reflect.Constructor;

import com.test1.bean.Son;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class clz = Son.class;

		Constructor[] constructors = clz.getConstructors();

		for (Constructor c : constructors) {
			System.out.println("getConstructor:" + c.toString());
		}

		constructors = clz.getDeclaredConstructors();

		for (Constructor c : constructors) {
			System.out.println("getDeclaredConstructors:" + c.toString());
		}

	}

}
