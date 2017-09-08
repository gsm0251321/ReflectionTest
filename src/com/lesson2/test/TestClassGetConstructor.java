package com.lesson2.test;

import java.lang.reflect.Constructor;

import com.lesson2.bean.Son;

/**
 * 获取 Constructor
 * 
 * @author gsm02
 *
 */
public class TestClassGetConstructor {

	public static void main(String[] args) {
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
