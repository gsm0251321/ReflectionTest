package com.test3.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.test3.bean.TestConstructor;

public class NewInstanceTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class clz = TestConstructor.class;

		try {
			TestConstructor test1 = (TestConstructor) clz.newInstance();

			System.out.println(test1.toString());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Constructor con = clz.getConstructor(String.class);

			TestConstructor test2 = (TestConstructor) con.newInstance("Zhao");

			System.out.println(test2.toString());

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
