package com.test1.test;

import java.lang.reflect.Modifier;

import com.test1.bean.TestModifier;

public class Test03 {

	public static void main(String[] args) {
		try {
			Class<?> clz = Class.forName("com.test1.bean.TestModifier");

			System.out.println("modifiers value:" + TestModifier.class.getModifiers());
			System.out.println("modifiers :" + Modifier.toString(TestModifier.class.getModifiers()));

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
