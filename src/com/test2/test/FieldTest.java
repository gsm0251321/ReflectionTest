package com.test2.test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.test2.bean.Son;

/**
 * Field 类型的获取/修饰符获取
 * 
 * @author gsm02
 *
 */
public class FieldTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class cls = Son.class;

		Field[] filed2 = cls.getFields();

		for (Field f : filed2) {
			System.out.println("Field :" + f.getName());
			System.out.println("Field type:" + f.getType());
			System.out.println("Field generic type:" + f.getGenericType());
			System.out.println("Field Modifier:" + Modifier.toString(f.getModifiers()));
			System.out.println("-------------------");
		}

	}
}
