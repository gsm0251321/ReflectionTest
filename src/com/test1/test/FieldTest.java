package com.test1.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.test1.bean.Son;

/**
 * 获取 Filed和method 属性
 * 
 * @author gsm02
 *
 */
public class FieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class cls = Son.class;

		try {
			Field field = cls.getDeclaredField("b");

		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("getDeclaredField " + e.getMessage());
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("getDeclaredField " + e.getMessage());
		}

		try {
			Field field = cls.getField("b");

		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("getField " + e.getMessage());
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("getField " + e.getMessage());
		}

		Field[] filed1 = cls.getDeclaredFields();

		for (Field f : filed1) {
			System.out.println("Declared Field :" + f.getName());
		}

		Field[] filed2 = cls.getFields();

		for (Field f : filed2) {
			System.out.println("Field :" + f.getName());
		}

		Method[] method1 = cls.getDeclaredMethods();
		for (Method m : method1) {
			System.out.println("Declared method :" + m.getName());
		}

		Method[] method2 = cls.getMethods();
		for (Method m : method2) {
			System.out.println("method :" + m.getName());
		}
	}
}
