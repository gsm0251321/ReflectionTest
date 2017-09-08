/**
 * 
 */
package com.lesson2.test;

import java.lang.reflect.Field;

import com.lesson2.bean.Son;

/**
 * 获取 Filed
 * 
 * 
 * 大家细细体会一下，不过需要注意的是 getDeclaredFileds() 方法可以获取 private、protected、public 和
 * default 属性，但是它获取不到从父类继承下来的属性。
 * 
 * //获取所有的属性，但不包括从父类继承下来的属性<br>
 * public Field[] getDeclaredFields() throwsSecurityException {}
 * 
 * //获取自身的所有的 public 属性，包括从父类继承下来的。<br>
 * public Field[] getFields() throws SecurityException {
 * 
 * @author gsm02
 *
 */
public class TestClassGetFiled {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
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

	}

}
